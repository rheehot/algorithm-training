package main.java.interviewkit.RecursionAndBacktracking;

/**
 * https://www.hackerrank.com/challenges/ctci-fibonacci-numbers
 * 기초적인 피보나치 수열 문제
 *
 * 점화식은
 * a1 = 0
 * a2 = 1
 * a3 = a1+a2
 * a4 = a2+a3
 * an = n-2 + n-1
 */
public class FibonacciNumbers {
    public static int fibonacci(int n) {
        if (n < 2) return  n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

}
