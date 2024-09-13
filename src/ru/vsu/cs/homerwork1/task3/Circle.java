package ru.vsu.cs.homerwork1.task3;

public class Circle {
    public double centerX;
    public double centerY;
    public double radius;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public boolean isPointInside(double x, double y) {
        return Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) < Math.pow(radius, 2);
    }
}