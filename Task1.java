package org.example.hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество элементов: ");
        int n = scanner.nextInt();
        System.out.println("Введите значения:");
        int summ = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) {
                summ += num;
            }
        }
        scanner.close();
        System.out.println(summ);
    }

    public static boolean isPrime(int n) {
        if (n > 1)
        {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
