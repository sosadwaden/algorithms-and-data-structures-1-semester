package ru.vsu.cs.homerwork1.task3;

import java.util.Scanner;

public class Task_3_52 {
    // Задаем фигуры согласно изображению
    public static final Line L1 = new Line(0, 4, 2); // Пример наклонной линии
    public static final Circle C1 = new Circle(2, 2, 2); // Круг
    public static final HorizontalParabola P1 = new HorizontalParabola(0, 2, 0.5); // Парабола

    public static SimpleColor getColor(double x, double y) {
        // Проверяем цвет области
        if (C1.isPointInside(x, y)) {
            if (P1.isPointRightOfParabola(x, y) && L1.isPointAboveLine(x, y)) {
                return SimpleColor.GREEN; // Внутри круга и выше линии
            }
            return SimpleColor.GRAY; // Внутри круга
        }
        if (P1.isPointRightOfParabola(x, y) && L1.isPointAboveLine(x, y)) {
            return SimpleColor.ORANGE; // Справа от параболы и выше линии
        }
        if (L1.isPointAboveLine(x, y)) {
            return SimpleColor.BLUE; // Выше линии и вне круга
        }

        return SimpleColor.WHITE; // Остальные области
    }

    public static void printColorForPoint(double x, double y) {
        System.out.println("Color for point (" + x + ", " + y + "): " + getColor(x, y));
    }

    public static void main(String[] args) {
        // Примеры точек
        printColorForPoint(1, 1);  // Возможная точка в серой области
        printColorForPoint(3, 3);  // Возможная точка в оранжевой области
        printColorForPoint(0, 5);  // Возможная точка в голубой области
        printColorForPoint(2, 2);  // Точка в зеленой области

        // Запрос координат от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты точки (x y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }

}
