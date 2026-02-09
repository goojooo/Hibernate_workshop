package com.squareup.okhttp;
import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Scanner;

public class AITextImprover {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your text: ");
        String userText = sc.nextLine();

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60, java.util.concurrent.TimeUnit.SECONDS)
                .readTimeout(120, java.util.concurrent.TimeUnit.SECONDS)
                .build();


        MediaType mediaType = MediaType.parse("application/json");

        JSONObject json = new JSONObject();
        json.put("model", "llama3");
        json.put("prompt", "Improve this text professionally and grammatically: " + userText);
        json.put("stream", false);

        RequestBody body = RequestBody.create(json.toString(), mediaType);

        Request request = new Request.Builder()
                .url("http://localhost:11434/api/generate")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();

        System.out.println("\nImproved Text:");
        System.out.println(response.body().string());
    }
}
