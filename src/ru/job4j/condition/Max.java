package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean compare = left > right;
        return compare ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.max(70, 100);
        System.out.println("наибольшее число: " + result);
    }
}
