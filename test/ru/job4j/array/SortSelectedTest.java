package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort5() {
        int[] data = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = {4, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort8() {
        int[] data = {9, 1, 15, 4, 31, 18, 2, 30};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 4, 9, 15, 18, 30, 31};
        Assert.assertArrayEquals(expected, result);
    }
}