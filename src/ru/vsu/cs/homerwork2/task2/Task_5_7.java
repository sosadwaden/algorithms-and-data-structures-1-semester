package ru.vsu.cs.homerwork2.task2;

import java.util.Scanner;

public class Task_5_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер: ");
        int s = scanner.nextInt();

        printDiamond(s);
    }

    public static void printDiamond(int s) {
        // Печать верхней строки из звезд
        printFullLine(s);

        // Верхняя часть ромба (с отступами и пробелами)
        for (int i = 1; i <= s / 2; i++) {
            printLine(s, i);
        }

        // Нижняя часть ромба (отражение верхней)
        for (int i = s / 2 - 1; i >= 1; i--) {
            printLine(s, i);
        }

        // Печать нижней строки из звезд
        printFullLine(s);
    }

    // Функция для печати полной строки из звезд
    public static void printFullLine(int s) {
        for (int i = 0; i < s; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Функция для печати строки ромба с отступом
    public static void printLine(int s, int i) {
        // Печатаем пробелы в начале строки
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }

        // Печатаем первую звезду
        System.out.print("*");

        // Печатаем пробелы между звездами
        for (int j = 0; j < s - 2 * i - 2; j++) {
            System.out.print(" ");
        }

        // Печатаем вторую звезду, если есть место
        if (s - 2 * i - 2 >= 0) {
            System.out.print("*");
        }

        // Переход на новую строку
        System.out.println();
    }
}
