package io.apicode.scale.service;

import com.google.protobuf.util.JsonFormat;
import io.apicode.model.ProfileProto;
import io.apicode.model.ProfileProto.Profile;
import io.apicode.model.ProfileProto.Profile.Builder;
import java.io.FileInputStream;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PostgresDataService {

  @PersistenceContext private EntityManager entityManager;

  public Profile insert(String profile) throws IOException {
    Builder profileBuilder = ProfileProto.Profile.newBuilder();
    FileInputStream fis = new FileInputStream("src/main/resources/" + profile + ".json");
    String data = IOUtils.toString(fis, "UTF-8");
    JsonFormat.parser().merge(data, profileBuilder);
    // Saving in PostGresDatabase
    entityManager.persist(profileBuilder.build());
    return profileBuilder.build();
  }

  public ProfileProto.Profile find(String email) {
    return entityManager.find(ProfileProto.Profile.class, email);
  }

  // @FluentLog(message = "Get Data as String at Data Service ", level =
  // LogLevel.INFO)
  // public Profile getDataAsString(String email) throws IOException {
  //
  // Optional<Profile> data = profileSQLRepository.findByEmail(email);
  //
  // return data.get();
  // }

  // @FluentLog(message = "Get Data as String at Data Service ", level =
  // LogLevel.INFO)
  // public Profile getProfileObject(String email) throws IOException {
  //
  // Optional<Profile> data =
  // profilePostgresRepository.findProfileProtoByEmail(email);
  //
  // return data.get();
  // }

  // @FluentLog(message = "Load all Data as String at Data Service ", level =
  // LogLevel.INFO)
  // public ProfileList loadAllFile(List<String> files) throws IOException {
  // ProfileList.Builder profileCompleteList = ProfileList.newBuilder();
  // for (String fileName : files) {
  // ProfileList.Builder profileList = ProfileList.newBuilder();
  // FileInputStream fis = new FileInputStream("src/main/resources/" + fileName);
  // String data = IOUtils.toString(fis, "UTF-8");
  // JsonFormat.parser().merge(data, profileList);
  // for (Profile pf : profileList.getProfilesList()) {
  // profileSQLRepository.save(pf);
  // }
  // profileCompleteList.addAllProfiles(profileList.getProfilesList());
  // }
  // return profileCompleteList.build();
  // }
}
