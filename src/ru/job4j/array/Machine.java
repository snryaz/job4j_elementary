package ru.job4j.array;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int chg = money - price;
        for (int j = 0; j < coins.length; j++) {
            while (chg - coins[j] >= 0) {
                chg -= coins[j];
                rsl[size] = coins[j];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
