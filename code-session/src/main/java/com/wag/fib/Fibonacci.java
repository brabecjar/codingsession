package com.wag.fib;

public class Fibonacci {

    /**
     * Find nth fibonacci number.
     *
     * Fibonacci sequence is defined as follows:
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n-1) + F(n-2)
     * Example of sequence: 0, 1, 1, 2, 3, 5, 8....
     * Example F(6) = 8
     *
     * What is wrong with following implementation?
     *
     * Change it so all unit tests are passed.
     */
    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
