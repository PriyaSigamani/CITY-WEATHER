package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CityFinder {

	private static Logger logger = LoggerFactory.getLogger(CityFinder.class);
	static ObjectMapper mapper = new ObjectMapper();
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		findCity();
	}
	
	public static void findCity() throws JsonMappingException, JsonProcessingException {
		CityBean cityBean = mapper.readValue(getUrlContents(), new TypeReference<CityBean>() {});
		java.util.List<List> list = cityBean.getList().stream()
				.filter(city -> (Objects.nonNull(city.getName()) && city.getName().startsWith("T"))).collect(Collectors.toList());
		logger.info("Number of cities starts with letter 'T' is : {}", list.size());
	}
		
	public static String getUrlContents() {
		StringBuilder content = new StringBuilder();
		try {
			// create a url object
			URL url = new URL("https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22");
			// create a urlconnection object
			URLConnection urlConnection = url.openConnection();
			// Wrap the urlconnection in a bufferedreader
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;
			// read from the urlconnection via the bufferedreader
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line + "\n");
			}
			bufferedReader.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return content.toString();
	}

}
