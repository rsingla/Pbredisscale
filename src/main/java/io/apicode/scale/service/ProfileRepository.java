package io.apicode.scale.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.google.protobuf.TextFormat;
import com.google.protobuf.TextFormat.ParseException;

import io.apicode.model.ProfileProto;
import io.apicode.model.ProfileProto.profile;
import io.apicode.model.ProfileProto.profile.Builder;
import net.openhft.hashing.LongHashFunction;
import redis.clients.jedis.Jedis;

@Repository
public class ProfileRepository implements CrudRepository<ProfileProto.profile, String> {

	@Autowired
	Jedis jedisConnection;

	public static final String PROFILES_KEY = "profile";


	@Override
	public long count() {
		return jedisConnection.pfcount(PROFILES_KEY);
	}

	@Override
	public void delete(ProfileProto.profile person) {
		Long KEY = hashKey(person.getEmail());
		jedisConnection.hdel(PROFILES_KEY+KEY, person.getEmail());
	}

	@Override
	public void deleteAll() {
		Set<String> emails = jedisConnection.hkeys(PROFILES_KEY);
		for (String email : emails) {
			deleteById(email);
		}

	}

	@Override
	public void deleteById(String email) {
		Long KEY = hashKey(email);
		jedisConnection.hdel(PROFILES_KEY+KEY, email);
	}

	@Override
	public void deleteAll(Iterable<? extends profile> entities) {
		Iterator<? extends profile> profiles = entities.iterator();

		while (profiles.hasNext()) {
			profile p = profiles.next();
			jedisConnection.hdel(PROFILES_KEY, p.getEmail());
		}
	}

	@Override
	public <S extends profile> Iterable<S> saveAll(Iterable<S> entities) {
		List<S> result = new ArrayList<>();

		for (S entity : entities) {
			save(entity);
			result.add(entity);
		}

		return result;
	}

	@Override
	public Optional<profile> findById(String email) {
		return Optional.of(getProfile(email));
	}

	@Override
	public boolean existsById(String email) {
		return jedisConnection.hexists(PROFILES_KEY+hashKey(email), email);
	}

	private Long hashKey(String insertItem) {
		Long KEY = LongHashFunction.xx().hashChars(insertItem);
		return KEY;
	}
	
	private profile getProfile(String email) {
		Long KEY = LongHashFunction.xx().hashChars(email);
		String value = jedisConnection.hget(PROFILES_KEY+KEY, email);
		
		Builder retrieved = profile.newBuilder();
		
		try {
			TextFormat.merge(value, retrieved);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return retrieved.build();
	}
	
	
	@Override
	public Iterable<profile> findAllById(Iterable<String> emails) {
		List<profile> listProfiles = new ArrayList<>();
		for (String email : emails) {
			profile p = getProfile(email);
			listProfiles.add(p);
		}
		return listProfiles;
	}

	@Override
	public Iterable<ProfileProto.profile> findAll() {
		
		return null;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public profile save(profile proObj) {
		String build = TextFormat.printToString(proObj);
		Long KEY = LongHashFunction.xx().hashChars(proObj.getEmail());
		
		jedisConnection.hset(PROFILES_KEY+KEY, proObj.getEmail(), build);

		return proObj;
	}



}
