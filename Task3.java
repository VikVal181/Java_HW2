package org.example.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество элементов: ");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        int indexSum = 0;
        System.out.println("Введите значения:");
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            if (Math.abs(mass[i]) > 9 && Math.abs(mass[i]) < 99) {
                indexSum += i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (mass[i] < 0) {
                mass[i] = indexSum;
            }
        }

        scanner.close();
        for (int i = 0; i < n; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
