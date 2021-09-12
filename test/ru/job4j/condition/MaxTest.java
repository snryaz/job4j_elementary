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

    @Test
    public void when3ArgumentsThirdIsMore() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3ArgumentsSecondIsMore() {
        int first = 20;
        int second = 33;
        int third = 27;
        int result = Max.max(first, second, third);
        int expected = 33;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3ArgumentsFirstIsMore() {
        int first = 120;
        int second = 33;
        int third = 27;
        int result = Max.max(first, second, third);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4ArgumentsFourthIsMore() {
        int first = 20;
        int second = 33;
        int third = 27;
        int fourth = 45;
        int result = Max.max(first, second, third, fourth);
        int expected = 45;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4ArgumentsThirdIsMore() {
        int first = 20;
        int second = 33;
        int third = 127;
        int fourth = 45;
        int result = Max.max(first, second, third, fourth);
        int expected = 127;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4ArgumentsSecondIsMore() {
        int first = 20;
        int second = 133;
        int third = 27;
        int fourth = 45;
        int result = Max.max(first, second, third, fourth);
        int expected = 133;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4ArgumentsFirstIsMore() {
        int first = 120;
        int second = 33;
        int third = 27;
        int fourth = 45;
        int result = Max.max(first, second, third, fourth);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }
}