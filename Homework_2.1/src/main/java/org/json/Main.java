package org.json;

public class Main {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        String color = config.getColor();
        int weight = config.getWeight();
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
    }
}