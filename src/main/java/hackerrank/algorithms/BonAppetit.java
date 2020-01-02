package main.java.hackerrank.algorithms;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetit {
    public static void bonAppetit(List<Integer> bill, int k, int b) {

        Integer sum = b - bill.stream()
                .reduce(0, (prev, val) -> val != bill.get(k) ? prev + val : prev + 0) / 2;

        System.out.println(sum < 1 ? "Bon Appetit": sum);

    }
}
