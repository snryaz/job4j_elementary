package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
       int rsl = 0;
       if (x1 != x2 && y1 != y2) {
           if (Math.abs(Math.abs(x2) - Math.abs(x1)) != Math.abs(Math.abs(y2) - Math.abs(y1))) {
               return rsl;
           }
           rsl = Math.abs(x2 - x1);
       }
       return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(7, 0, 0, 7));

    }
}
