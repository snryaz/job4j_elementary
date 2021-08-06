package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax10To2Then1() {
        int left = 10;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5To5Then1() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}