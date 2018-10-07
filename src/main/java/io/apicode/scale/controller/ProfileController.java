package io.apicode.scale.controller;

import com.google.common.flogger.FluentLogger;
import com.google.protobuf.util.JsonFormat;
import com.google.protobuf.util.JsonFormat.Printer;
import io.apicode.model.ProfileListProto.ProfileList;
import io.apicode.model.ProfileProto;
import io.apicode.model.ProfileProto.Profile;
import io.apicode.scale.FluentLog;
import io.apicode.scale.service.PostgresDataService;
import io.apicode.scale.service.RedisDataService;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProfileController {

  @Autowired RedisDataService dataService;

  @Autowired PostgresDataService postgresDataService;

  FluentLogger LOG = FluentLogger.forEnclosingClass();

  @GetMapping("/profile/postgres/{id}")
  @FluentLog
  public ResponseEntity<Profile> savePostGresData(@PathVariable String id) throws IOException {
    ProfileProto.Profile profileData = postgresDataService.insert(id);

    Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

    LOG.atInfo().log(jsonFormat.toString());

    return ResponseEntity.ok(profileData);
  }

  @GetMapping("/profile/proto/{id}")
  @FluentLog
  public ResponseEntity<Profile> getProfile(@PathVariable String id) throws IOException {
    ProfileProto.Profile profileData = dataService.getData(id);

    Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

    LOG.atInfo().log(jsonFormat.toString());

    return ResponseEntity.ok(profileData);
  }

  @GetMapping("/profile/{email}")
  @FluentLog
  public ResponseEntity<String> getProfileByEmail(@PathVariable String email) throws IOException {
    ProfileProto.Profile profileData = dataService.getDataAsString(email);

    Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

    return ResponseEntity.ok(jsonFormat.print(profileData));
  }

  @GetMapping("/v2/profile/proto/{email}")
  @FluentLog
  public ResponseEntity<Profile> getProfileByEmailWithProtoObject(@PathVariable String email)
      throws IOException {
    ProfileProto.Profile profileData = dataService.getProfileObject(email);

    // Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

    return ResponseEntity.ok(profileData);
  }

  @GetMapping("/load/all")
  @FluentLog
  public ResponseEntity<ProfileList> loadAll() throws IOException {
    List<String> fileName = List.of("file5.json");
    ProfileList profileList = dataService.loadAllFile(fileName);

    return ResponseEntity.ok(profileList);
  }
}
