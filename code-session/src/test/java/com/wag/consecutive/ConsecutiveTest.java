package com.wag.consecutive;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConsecutiveTest {

    @Test
    public void testFindConsecutiveWithValidInput() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 4, 2, 3, 5, 7, 8, 9, 10));
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(7, 8, 9, 10));
        assertEquals(expectedOutput, Consecutive.findLongestConsecutiveSubsequence(numbers));
    }

    @Test
    public void testFindConsecutiveWithNegativeNumbers() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(-5, -2, -1, 0, 1, 2, 3, 4, 5));
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, 3, 4, 5));
        assertEquals(expectedOutput, Consecutive.findLongestConsecutiveSubsequence(numbers));
    }

    @Test
    public void testFindConsecutiveWithSingleNumber() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5));
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(5));
        assertEquals(expectedOutput, Consecutive.findLongestConsecutiveSubsequence(numbers));
    }

    @Test
    public void testFindConsecutiveWithRandomInput() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 8, 9, 11, 12, 13, 14, 16, 20));
        List<Integer> expectedOutput = new ArrayList<>(Arrays.asList(11, 12, 13, 14));
        assertEquals(expectedOutput, Consecutive.findLongestConsecutiveSubsequence(numbers));
    }
}
