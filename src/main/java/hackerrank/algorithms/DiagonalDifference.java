package main.java.hackerrank.algorithms;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < arr.size(); i++) {
            primaryDiagonal += arr.get(i).get(i);
            secondaryDiagonal += arr.get(i).get((arr.size() - 1) - i);
        }

        System.out.println("result : a = "+ primaryDiagonal + ", b = "+ secondaryDiagonal);

        return Math.abs(primaryDiagonal - secondaryDiagonal);
    }
}
