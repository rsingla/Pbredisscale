package io.apicode.scale.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.google.protobuf.util.JsonFormat;
import com.google.protobuf.util.JsonFormat.Printer;

import io.apicode.model.ProfileProto;
import io.apicode.scale.service.DataService;

@Controller
public class ProfileController {

	@Autowired
	DataService dataService;

	@GetMapping("/profile/proto/{id}")
	public ResponseEntity<String> getProfile(@PathVariable Integer id) throws IOException {
		ProfileProto.profile profileData = dataService.getData();

		Printer jsonFormat = JsonFormat.printer().includingDefaultValueFields();

		return ResponseEntity.ok(jsonFormat.print(profileData));
	}

	@GetMapping("/profile/{id}")
	public ResponseEntity<String> getCurrentJsonData(@PathVariable Integer id) throws IOException {
		return ResponseEntity.ok(dataService.getDataAsString());
	}

}
