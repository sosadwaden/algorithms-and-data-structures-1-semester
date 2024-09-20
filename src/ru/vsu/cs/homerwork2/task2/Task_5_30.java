package ru.vsu.cs.homerwork2.task2;

import java.util.Scanner;

public class Task_5_30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt(); // Ширина фигуры

        printPattern(w);
    }

    public static final int HEIGHT = 9;

    public static void printPattern(int w) {
        printHorizontalLine(w);

        for (int i = 0; i < HEIGHT / 2 + 1; i++) {
            printLine(w, i);
        }
        for (int i = HEIGHT / 2 - 1; i >= 0; i--) {
            printLine(w, i);
        }

        printHorizontalLine(w);
    }

    // Функция для печати горизонтальной рамки
    public static void printHorizontalLine(int w) {
        System.out.print(" ");
        for (int i = 0; i < w; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    // Функция для печати строки с восклицательными знаками
    public static void printLine(int w, int i) {
        System.out.print("|");  // Левая граница

        // Количество пробелов до начала восклицательных знаков
        int spacesBefore = i * 3;  // Изменено на *3 для корректного выравнивания

        // Количество восклицательных знаков в текущей строке
        int exclamations = i + 1;

        // Печатаем пробелы перед восклицательными знаками
        for (int j = 0; j < spacesBefore; j++) {
            System.out.print(" ");
        }

        // Рассчитываем количество восклицательных знаков, которые можно напечатать
        int maxExclamations = w - spacesBefore;
        exclamations = Math.min(exclamations, maxExclamations);

        // Печатаем восклицательные знаки
        for (int j = 0; j < exclamations; j++) {
            System.out.print("!");
        }

        // Заполняем оставшиеся пробелы после восклицательных знаков
        int remainingSpaces = w - spacesBefore - exclamations;
        for (int j = 0; j < remainingSpaces; j++) {
            System.out.print(" ");
        }

        System.out.println("|");  // Правая граница
    }
}
