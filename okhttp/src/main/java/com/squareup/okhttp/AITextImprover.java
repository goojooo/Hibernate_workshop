package com.squareup.okhttp;

import java.io.IOException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AITextImprover {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your text : ");
		String userText = sc.nextLine(); // input-user

		String apiKey = "";

		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/json");

		JSONObject textObject = new JSONObject();
		textObject.put("text", "Improve this text professionally and grammatically: " + userText);

		JSONArray partsArray = new JSONArray();
		partsArray.put(textObject);

		JSONObject contentObject = new JSONObject();
		contentObject.put("parts", partsArray);

		JSONArray contentsArray = new JSONArray();
		contentsArray.put(contentObject);

		JSONObject finalRequest = new JSONObject();
		finalRequest.put("contents", contentsArray);


//		JSONObject part = new JSONObject();
//		part.put("parts", new org.json.JSONArray().put(textObject));
//
//		JSONObject requestBodyJson = new JSONObject();
//		requestBodyJson.put("content", new org.json.JSONArray().put(part));

		RequestBody body = RequestBody.create(finalRequest.toString(), mediaType);

		Request request = new Request.Builder()
			    .url("https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=" + apiKey)
			    .post(body)
			    .addHeader("Content-Type", "application/json")
			    .build();


		Response resp = client.newCall(request).execute();
		System.out.println("\nImproved text : ");
		System.out.println(resp.body().string());
	}

}
