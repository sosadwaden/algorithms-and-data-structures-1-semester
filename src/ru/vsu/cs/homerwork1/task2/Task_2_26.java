package ru.vsu.cs.homerwork1.task2;

import java.util.Scanner;

public class Task_2_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество мальчиков (N): ");
        int boys = scanner.nextInt();

        System.out.print("Введите количество девочек (M): ");
        int girls = scanner.nextInt();

        int maxTeams = calculateMaxTeams(boys, girls);

        System.out.printf("Максимальное количество команд: %d", maxTeams);
    }

    public static int calculateMaxTeams(int boys, int girls) {
        if (boys < 1 || girls < 1) {
            return 0;
        }

        int teamsByBoys = boys / 1;
        int teamsByGirls = girls / 1;

        int totalStudents = boys + girls;

        int maxTeams = totalStudents / 3;

        return Math.min(Math.min(teamsByBoys, teamsByGirls), maxTeams);
    }
}
