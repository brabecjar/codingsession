package com.wag.second;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondLargestTest {
    @Test
    public void testFindSecondLargestWithValidInput() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, SecondLargest.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargestWithDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 5, 5};
        assertEquals(4, SecondLargest.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargestWithNegativeNumbers() {
        int[] arr = {-5, -2, -1, -10};
        assertEquals(-2, SecondLargest.findSecondLargest(arr));
    }

    @Test
    public void testFindSecondLargestWithEmptyArray() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> {
            SecondLargest.findSecondLargest(arr);
        });
    }

    @Test
    public void testFindSecondLargestWithOneElementArray() {
        int[] arr = {5};
        assertThrows(IllegalArgumentException.class, () -> {
            SecondLargest.findSecondLargest(arr);
        });
    }
}
