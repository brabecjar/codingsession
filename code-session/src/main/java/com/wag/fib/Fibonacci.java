package com.wag.fib;

public class Fibonacci {

    /**
     * What is wrong with following code?
     *
     * Change it so all unit tests are passed.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
