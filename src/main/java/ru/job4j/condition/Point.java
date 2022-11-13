package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double powX = Math.pow(x2 - x1, 2);
        double powY = Math.pow(y2 - y1, 2);
        double rsl = Math.sqrt(powX + powY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 1, 2, 10);
        System.out.println("result (5, 1) to (2, 10) " + result);
    }
}