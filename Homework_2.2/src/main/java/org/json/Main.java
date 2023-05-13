package org.json;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number = ");
        int num1 = scanner.nextInt();
        System.out.print("Second number = ");
        int num2 = scanner.nextInt();

        String jsonString = "{\"n1\": " + num1 + ", \"n2\": " + num2 + "}";
        C2 instanceOfC2 = new C2(jsonString);
        C1 instanceOfC1 = new C1Adapter(instanceOfC2);
        int sum = instanceOfC1.getSum();
        System.out.println("Sum = " + sum);
    }
}