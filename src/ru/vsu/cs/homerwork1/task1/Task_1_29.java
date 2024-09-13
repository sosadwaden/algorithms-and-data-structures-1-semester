package ru.vsu.cs.homerwork1.task1;

import java.util.Scanner;

public class Task_1_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число, которое хотите развернуть: ");
        int x = scanner.nextInt();

        flipTheNumber(x);
    }

    public static void flipTheNumber(int x) {
        int a = x / 100;
        int b = x / 10 % 10;
        int c = x % 10;

        int y = c * 100 + b * 10 + a;
        System.out.printf("Мы развернули число %d и получили %d", x, y);
    }
}
