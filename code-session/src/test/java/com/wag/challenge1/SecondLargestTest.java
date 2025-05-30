package com.wag.challenge1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestTest {
    @Test
    public void testFindSecondLargestWithValidInput() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        assertEquals(4, SecondLargest.findSecondLargest(integers));
    }

    @Test
    public void testFindSecondLargestWithDuplicates() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 5, 5);
        assertEquals(4, SecondLargest.findSecondLargest(integers));
    }

    @Test
    public void testFindSecondLargestWithTwoElementArray() {
        List<Integer> integers = List.of(5, 6);
        assertEquals(5, SecondLargest.findSecondLargest(integers));
    }

    @Test
    public void testFindSecondLargestWithTwoElementArray02() {
        List<Integer> integers = List.of(6, 5);
        assertEquals(5, SecondLargest.findSecondLargest(integers));
    }

    @Test
    public void testFindSecondLargestWithMoreElementsInTheArray() {
        List<Integer> integers = List.of(6, 3, 2, 5, 4);
        assertEquals(5, SecondLargest.findSecondLargest(integers));
    }

    @Test
    public void testFindSecondLargestWithNegativeElementsInTheArray() {
        List<Integer> integers = List.of(-1, 0, 2, 5, 4);
        assertEquals(4, SecondLargest.findSecondLargest(integers));
    }

    @Test
    public void testFindSecondLargestWithNegativeElementsInTheArray2() {
        List<Integer> integers = List.of(-1, 0, 2, 5, -3);
        assertEquals(2, SecondLargest.findSecondLargest(integers));
    }

}
