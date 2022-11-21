package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return left >= max(right, third) ? left : max(right, third);
    }

    public static int max(int left, int right, int third, int fourd) {
        return left >= max(right, third, fourd) ? left : max(right, third, fourd);
    }
}