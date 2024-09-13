package ru.vsu.cs.homerwork1.task1;

import java.util.Scanner;

public class Task_1_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус первого круга: ");
        int radius1 = scanner.nextInt();

        System.out.print("Введите радиус второго круга: ");
        int radius2 = scanner.nextInt();

        System.out.print("Введите радиус третьего круга: ");
        int radius3 = scanner.nextInt();

        findTheAreaOfTheShadedAreas(radius1, radius2, radius3);
    }

    public static void findTheAreaOfTheShadedAreas(int radius1, int radius2, int radius3) {
        double square1 = Math.PI * radius1 * radius1;
        double square2 = Math.PI * radius2 * radius2;
        double square3 = Math.PI * radius3 * radius3;

        double areaResult1 = (square1 / 8) * 2;
        double areaResult2 = (square2 - square1) / 8 * 5;
        double areaResult3 = (square3 - square2) / 8 * 2;

        double squareArea = (radius3 + radius3) * (radius3 + radius3);

        double areaOutsideTheCircle = (squareArea - square3) / 8 * 4;

        System.out.printf("Площадь закрашенных частей в круге 1: %f\n", areaResult1);
        System.out.printf("Площадь закрашенных частей в круге 2: %f\n", areaResult2);
        System.out.printf("Площадь закрашенных частей в круге 3: %f\n", areaResult3);
        System.out.printf("Площадь закрашенных частей вне круга: %f\n", areaOutsideTheCircle);
    }
}
