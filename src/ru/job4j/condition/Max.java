package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean compare = left > right;
        return compare ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first,
                max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first,
                max(second,
                        max(third, fourth)));
    }

    public static void main(String[] args) {
        int result = Max.max(70, 100);
        System.out.println("наибольшее число: " + result);
    }
}
