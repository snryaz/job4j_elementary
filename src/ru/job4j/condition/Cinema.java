package ru.job4j.condition;

public class Cinema {
    public static void acces(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age > 18) {
            System.out.println("Welcome to the cinema.");
        } else  {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        acces(21);
        acces(16);
    }
}
