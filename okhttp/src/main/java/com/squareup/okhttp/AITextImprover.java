package com.squareup.okhttp;
import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AITextImprover {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(5, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .build();

        while(true) {

            System.out.println("\n========= AI SMART TEXT IMPROVER =========");
            System.out.println("1. Grammar Improvement");
            System.out.println("2. Professional Tone");
            System.out.println("3. Shorten Text");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if(choice == 4) {
                System.out.println("👋 Exiting program...");
                break;
            }

            System.out.print("\nEnter your text: ");
            String userText = sc.nextLine();

            String prompt = "";

            switch(choice) {
                case 1:
                    prompt = "Fix grammar of this text: " + userText;
                    break;

                case 2:
                    prompt = "Rewrite this text in professional tone: " + userText;
                    break;

                case 3:
                    prompt = "Summarize this text shortly: " + userText;
                    break;

                default:
                    System.out.println("❌ Invalid choice");
                    continue;
            }

            String improvedText = callOllama(client, prompt);

            printFormattedOutput(userText, improvedText);
        }

        sc.close();
    }

    // 🔥 Method to call Ollama AI
    public static String callOllama(OkHttpClient client, String prompt) throws IOException {

        MediaType mediaType = MediaType.parse("application/json");

        JSONObject json = new JSONObject();
        json.put("model", "llama3");
        json.put("prompt", prompt);
        json.put("stream", false);

        RequestBody body = RequestBody.create(json.toString(), mediaType);

        Request request = new Request.Builder()
                .url("http://localhost:11434/api/generate")
                .post(body)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();

        JSONObject resultJson = new JSONObject(response.body().string());

        return resultJson.getString("response").trim();
    }

    // 🎨 Method to print formatted output
    public static void printFormattedOutput(String original, String improved) {

        System.out.println("\n======================================");
        System.out.println("✨ AI SMART TEXT IMPROVER ✨");
        System.out.println("======================================");

        System.out.println("\n📥 Original Text:");
        System.out.println("   " + original);

        System.out.println("\n📤 Improved Text:");
        System.out.println("   " + improved);

        System.out.println("\n======================================");
        System.out.println("✅ Completed Successfully");
        System.out.println("======================================");
    }
}
