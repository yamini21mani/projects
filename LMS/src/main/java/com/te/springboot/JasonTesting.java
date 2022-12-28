package com.te.springboot;

import org.json.JSONObject;

public class JasonTesting {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("empId", "1");
		jsonObject.put("empName", "sh");
		jsonObject.put("empPass", "qwerty");
		jsonObject.put("empEmail", "sh@gmail.com");
		System.out.println(jsonObject);

	}
}
