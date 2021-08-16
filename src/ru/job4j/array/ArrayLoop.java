package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] result = new int[5];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * 2 + 3;
        }
        for (int rsl : result) {
            System.out.println(rsl);
        }
    }
}
