package ru.vsu.cs.homerwork2.task2;

import java.util.Scanner;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину квадрата (не менее 3): ");
        int w = scanner.nextInt();

        int innerWidth = w - 2;  // Внутренняя ширина квадрата

        // Верхняя граница квадрата
        System.out.println(" " + "-".repeat(w));

        // Печать первой половины рисунка
        int spaces = 0;  // Начальный отступ для первой половины
        for (int i = 1; i <= 4; i++) {
            int exclamations = i;  // Количество восклицательных знаков на текущей строке
            printRow(innerWidth, exclamations, spaces);
            spaces += exclamations;  // Увеличиваем отступ на количество знаков
        }

        // Печать середины
        printRow(innerWidth, 5, spaces);  // Выводим строку с 5 восклицательными знаками

        // Печать второй половины рисунка
        spaces += 5;  // Увеличиваем отступ для второй половины
        for (int i = 4; i >= 1; i--) {
            spaces -= i;  // Уменьшаем отступ на количество знаков
            printRow(innerWidth, i, spaces);
        }

        // Нижняя граница квадрата
        System.out.println(" " + "-".repeat(w));
    }

    // Метод для печати одной строки с восклицательными знаками
    private static void printRow(int w, int exclamations, int spaces) {
        System.out.print("|");
        if (spaces + exclamations <= w) {
            System.out.print(" ".repeat(spaces) + "!".repeat(exclamations) + " ".repeat(w - spaces - exclamations));
        } else {
            System.out.print(" ".repeat(spaces) + "!".repeat(w - spaces));
        }
        System.out.println("|");
    }
}


