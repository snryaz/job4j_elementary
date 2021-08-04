package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0C0X2() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);

    }

    @Test
    public void whenA1B1C1X1() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 3;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, rsl1);
    }

    @Test
    public void whenA0B1C1X1() {
        int a1 = 0;
        int b1 = 1;
        int c1 = 1;
        int x1 = 1;
        int expected1 = 2;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, rsl1);
    }

    @Test
    public void whenA1B1C0X1() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 0;
        int x1 = 1;
        int expected1 = 2;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, rsl1);
    }

    @Test
    public void whenA1B1C1X0() {
        int a1 = 1;
        int b1 = 1;
        int c1 = 1;
        int x1 = 0;
        int expected1 = 1;
        int rsl1 = X2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, rsl1);
    }
}