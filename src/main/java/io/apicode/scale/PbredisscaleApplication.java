package io.apicode.scale;

import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

import io.apicode.log.FluentLog;
import io.apicode.log.LogLevel;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class PbredisscaleApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(PbredisscaleApplication.class, args);
	}

	@Bean
	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
		return new ProtobufHttpMessageConverter();
	}

	@Bean
	@FluentLog(message="Created Jedis Connection", level=LogLevel.INFO)
	public Jedis jedisConnection() throws UnknownHostException {
		//Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		// Jedis Cluster will attempt to discover cluster nodes automatically
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		return jedis;
	}

}
