package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPossitive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPossitbve(int num) {
        return !isPossitive(num);
    }

    public static boolean notEbenAndPositive(int num) {
        return notEven(num) && isPossitive(num);
    }

    public static boolean evenOrNotPossitive(int num) {
        return isEven(num) || notPossitbve(num);
    }
}
