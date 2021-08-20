package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMiddMin() {
        int[] array = {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}