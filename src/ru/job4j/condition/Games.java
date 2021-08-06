package ru.job4j.condition;

public class Games {
    public static void premission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the gaming club");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.premission(true, true);
        Games.premission(true, false);
        Games.premission(false, true);
        Games.premission(false, false);
    }
}
