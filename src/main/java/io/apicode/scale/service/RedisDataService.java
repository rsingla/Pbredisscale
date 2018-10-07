package io.apicode.scale.service;

import com.google.protobuf.util.JsonFormat;
import io.apicode.model.ProfileListProto.ProfileList;
import io.apicode.model.ProfileProto;
import io.apicode.model.ProfileProto.Profile;
import io.apicode.model.ProfileProto.Profile.Builder;
import io.apicode.scale.FluentLog;
import io.apicode.scale.LogLevel;
import io.apicode.scale.repository.ProfileRedisRepository;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RedisDataService {

  @Autowired ProfileRedisRepository profileRedisRepository;

  @FluentLog(message = "Get Data at Data Service ", level = LogLevel.INFO)
  public ProfileProto.Profile getData(String profile) throws IOException {
    Builder builder = ProfileProto.Profile.newBuilder();
    FileInputStream fis = new FileInputStream("src/main/resources/" + profile + ".json");
    String data = IOUtils.toString(fis, "UTF-8");
    JsonFormat.parser().merge(data, builder);
    // Saving in Redis
    profileRedisRepository.save(builder.build());

    return builder.build();
  }

  @FluentLog(message = "Get Data as String at Data Service ", level = LogLevel.INFO)
  public Profile getDataAsString(String email) throws IOException {

    Optional<Profile> data = profileRedisRepository.findById(email);

    return data.get();
  }

  @FluentLog(message = "Get Data as String at Data Service ", level = LogLevel.INFO)
  public Profile getProfileObject(String email) throws IOException {

    Optional<Profile> data = profileRedisRepository.findProfileProtoByEmail(email);

    return data.get();
  }

  @FluentLog(message = "Load all Data as String at Data Service ", level = LogLevel.INFO)
  public ProfileList loadAllFile(List<String> files) throws IOException {
    ProfileList.Builder profileCompleteList = ProfileList.newBuilder();
    for (String fileName : files) {
      ProfileList.Builder profileList = ProfileList.newBuilder();
      FileInputStream fis = new FileInputStream("src/main/resources/" + fileName);
      String data = IOUtils.toString(fis, "UTF-8");
      JsonFormat.parser().merge(data, profileList);
      for (Profile pf : profileList.getProfilesList()) {
        profileRedisRepository.save(pf);
      }
      profileCompleteList.addAllProfiles(profileList.getProfilesList());
    }
    return profileCompleteList.build();
  }
}
