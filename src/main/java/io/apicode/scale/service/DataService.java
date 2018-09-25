package io.apicode.scale.service;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import com.google.protobuf.util.JsonFormat;

import io.apicode.model.ProfileProto;
import io.apicode.model.ProfileProto.profile.Builder;

@Service
public class DataService {

	public ProfileProto.profile getData() throws IOException {
		Builder builder = ProfileProto.profile.newBuilder();
		FileInputStream fis = new FileInputStream("src/main/resources/profile1.json");
		String data = IOUtils.toString(fis, "UTF-8");
		JsonFormat.parser().merge(data, builder);

		return builder.build();
	}

	public String getDataAsString() throws IOException {

		FileInputStream fis = new FileInputStream("src/main/resources/profile1.json");
		String data = IOUtils.toString(fis, "UTF-8");

		return data;
	}

}
