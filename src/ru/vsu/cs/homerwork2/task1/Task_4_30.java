package ru.vsu.cs.homerwork2.task1;

import java.util.Scanner;

public class Task_4_30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите k: ");
        int k = scanner.nextInt();
        int result = findKthDigit(k);

        System.out.println("k-я цифра последовательности: " + result);
    }

    // Функция для нахождения k-й цифры последовательности
    public static int findKthDigit(int k) {
        int digitLength = 1; // Текущая длина числа (1 для однозначных, 2 для двузначных и т.д.)
        long count = 9; // Количество чисел с текущей длиной
        int start = 1; // Первое число с текущей длиной

        // Шаг 1: Определяем разрядность числа, в котором находится k-я цифра
        while (k > digitLength * count) {
            k -= digitLength * count; // Вычитаем все цифры текущей длины
            digitLength++; // Увеличиваем длину числа (переходим к двузначным, трёхзначным и т.д.)
            count *= 10; // Количество чисел следующей длины (например, 90 для двузначных)
            start *= 10; // Первое число следующей длины (например, 10 для двузначных)
        }

        // Шаг 2: Находим конкретное число
        int number = start + (k - 1) / digitLength; // Определяем число
        int digitIndex = (k - 1) % digitLength; // Индекс цифры в числе

        // Шаг 3: Извлекаем цифру
        for (int i = digitLength - digitIndex - 1; i > 0; i--) {
            number /= 10; // Убираем лишние цифры
        }

        return number % 10; // Возвращаем нужную цифру
    }
}
