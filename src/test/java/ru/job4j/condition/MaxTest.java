package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maximumOf4It6() {
        int first = 2;
        int second = 5;
        int third = 1;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void maximumOf3It4() {
        int first = 2;
        int second = 4;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}