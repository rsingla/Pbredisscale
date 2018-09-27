package io.apicode.scale.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.google.common.flogger.FluentLogger;
import com.google.protobuf.util.JsonFormat;
import com.google.protobuf.util.JsonFormat.Printer;

import io.apicode.log.FluentLog;
import io.apicode.log.LogLevel;
import io.apicode.model.ProfileProto;
import io.apicode.scale.service.DataService;

@Controller
public class ProfileController {

	@Autowired
	DataService dataService;

	FluentLogger LOG = FluentLogger.forEnclosingClass();

	
	@GetMapping("/profile/proto/{id}")
	@FluentLog(message="Controller method for get profile", level=LogLevel.FINE)
	public ResponseEntity<String> getProfile(@PathVariable String id) throws IOException {
		ProfileProto.profile profileData = dataService.getData(id);

		Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

		return ResponseEntity.ok(jsonFormat.print(profileData));
	}

	@GetMapping("/profile/{email}")
	@FluentLog(message="Controller method for getProfileByEmail", level=LogLevel.FINE)
	public ResponseEntity<String> getProfileByEmail(@PathVariable String email) throws IOException {
		ProfileProto.profile profileData = dataService.getDataAsString(email);

		Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

		return ResponseEntity.ok(jsonFormat.print(profileData));
	}

}
