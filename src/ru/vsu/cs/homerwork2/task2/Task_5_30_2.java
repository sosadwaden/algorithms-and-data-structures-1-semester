package ru.vsu.cs.homerwork2.task2;

import java.util.Scanner;

public class Task_5_30_2 {

    public static final int HEIGHT = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int w = scanner.nextInt(); // Ширина фигуры
        int w = 14;

        printPattern(w);
    }

    public static void printPattern(int w) {
        printHorizontalLine(w);
        printLine(w);
        printHorizontalLine(w);
    }

    // Функция для печати горизонтальной рамки
    private static void printHorizontalLine(int w) {
        System.out.print(" ");

        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }

        System.out.println();
    }

    // Функция для печати строки с восклицательными знаками
    private static void printLine(int w) {
        int leftSpace = 0;
        int rightSpace = 11;
        int iter = 0;
        int vocklZnak = 1;
        boolean reverse = false;

        if (!reverse) {

            for (int i = 0; i <= 9; i++) {
                System.out.print("|");  // Левая граница

                for (int k = 0; k < leftSpace; k++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < vocklZnak; j++) {
                    if (iter + vocklZnak > w - 2) {
                        reverse = true;
                        break;
                    }

                    System.out.print("!");
                    iter++;
                }

                for (int z = 0; z < rightSpace; z++) {
                    System.out.print(" ");
                }

                iter += vocklZnak;
                leftSpace += vocklZnak;
                rightSpace -= vocklZnak + 1;
                vocklZnak++;
                System.out.println("|");  // Правая граница
            }
        } else {
            for (int f = 0; f <= iter + vocklZnak - w - 2; f++) {
                System.out.print("!");
            }

            rightSpace = 0;
            rightSpace += iter + vocklZnak - w - 2;

            leftSpace = 11 - rightSpace;
        }



    }
}
