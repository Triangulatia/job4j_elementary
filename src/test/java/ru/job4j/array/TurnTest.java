package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void back6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = Turn.back(input);
        int[] expected = {6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}