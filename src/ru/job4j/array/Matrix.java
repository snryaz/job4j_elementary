package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] mulTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mulTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return mulTable;
    }
}
