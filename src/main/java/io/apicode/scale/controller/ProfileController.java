package io.apicode.scale.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.google.common.flogger.FluentLogger;
import com.google.protobuf.util.JsonFormat;
import com.google.protobuf.util.JsonFormat.Printer;

import io.apicode.model.ProfileListProto.ProfileList;
import io.apicode.model.ProfileProto;
import io.apicode.scale.FluentLog;
import io.apicode.scale.LogLevel;
import io.apicode.scale.service.DataService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ProfileController {

	@Autowired
	DataService dataService;

	FluentLogger LOG = FluentLogger.forEnclosingClass();

	@GetMapping("/profile/proto/{id}")
	@FluentLog(message = "Controller method for get profile", level = LogLevel.INFO)
	public ResponseEntity<String> getProfile(@PathVariable String id) throws IOException {
		ProfileProto.Profile profileData = dataService.getData(id);

		Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

		LOG.atInfo().log(jsonFormat.toString());

		return ResponseEntity.ok(jsonFormat.print(profileData));
	}

	@GetMapping("/profile/{email}")
	@FluentLog(message = "Controller method for getProfileByEmail", level = LogLevel.INFO)
	public ResponseEntity<String> getProfileByEmail(@PathVariable String email) throws IOException {
		ProfileProto.Profile profileData = dataService.getDataAsString(email);

		Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

		return ResponseEntity.ok(jsonFormat.print(profileData));
	}

	@GetMapping("/load/all")
	@FluentLog(message = "Load all data for Profile", level = LogLevel.INFO)
	public ResponseEntity<ProfileList> loadAll() throws IOException {
		List<String> fileName = List.of("file5.json");
		ProfileList profileList = dataService.loadAllFile(fileName);

		return ResponseEntity.ok(profileList);
	}

}
