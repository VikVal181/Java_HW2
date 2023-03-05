package org.example.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество элементов: ");
        int n = scanner.nextInt();
        System.out.println("Введите значения:");
        int num = scanner.nextInt();
        boolean increase = true;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num2 <= num) {
                increase = false;
            }
            num = num2;
        }
        scanner.close();
        if (increase) {
            System.out.println("Последовательность возрастает");
        }
        else {
            System.out.println("Последовательность не возрастает");
        }
    }
}
