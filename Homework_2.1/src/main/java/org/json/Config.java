package org.json;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Config {
    private static Config instance = null;
    private String color;
    private int weight;

    private Config() {}

    public static Config getInstance() {
        if(instance == null) {
            instance = new Config();
            try {
                FileInputStream inputStream = new FileInputStream("src/main/resources/config.json");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line);
                }
                JSONObject jsonObject = new JSONObject(stringBuilder.toString());
                instance.color = jsonObject.getString("color");
                instance.weight = jsonObject.getInt("weight");
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}