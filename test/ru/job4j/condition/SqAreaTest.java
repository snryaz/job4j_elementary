package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K9Square2Point25() {
        int p = 10;
        double k = 9;
        double expected = 2.25;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP100K9Square225() {
        int p = 100;
        double k = 9;
        int expected = 225;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}