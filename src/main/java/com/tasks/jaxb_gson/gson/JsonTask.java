package com.tasks.jaxb_gson.gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class JsonTask {
	
	public JsonTask() {
		
	}
	
	
	/**
	 * Method deserialize Json
	 * @return
	 */
	public boolean deserialization() {
		
		Gson gson = new Gson();
		
		
		String json = null;
		try {
			json = new String(Files.readAllBytes(Paths.get("src/main/resources/actor.json")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Actor actor = gson.fromJson(json,Actor.class);
		System.out.println(actor);
		return false;
	}
	
	/**
	 * Method serialize object
	 * @return
	 */
	public boolean serialization() {
		Gson gson = new Gson();
		
		Actor actor = new Actor("Name","Artist","Description",null);
		
		String json = gson.toJson(actor);
		System.out.println(json);
		return true;
		
	}

	
}
