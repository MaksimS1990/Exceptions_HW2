package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        inputFloat();
    }
    private static float inputFloat() {
        String input = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ввод дробного числа: ");
                System.out.println(input = scanner.nextLine());
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные!!!");
            }
            System.out.println(input);
        }
    }
}
