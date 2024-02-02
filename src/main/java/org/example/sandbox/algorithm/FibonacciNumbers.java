package org.example.sandbox.algorithm;

public class FibonacciNumbers {

    public static void main(String[] args) {

        FibonacciNumbers fn = new FibonacciNumbers();

        for(int x = 0; x <= 55; x ++) {
            System.out.println("fib(" + x + ") = " + fn.fib(x));
        }

    }

    private long fib(int n) {

        if(n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n-1) + fib(n - 2);
    }

}