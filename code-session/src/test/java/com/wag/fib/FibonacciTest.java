package com.wag.fib;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonacciOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacciTen() {
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    public void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
    }

    @Test
    public void testFibonacciLargeInput() {
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            assertEquals(1836311903, Fibonacci.fibonacci(46));
        });
    }

}
