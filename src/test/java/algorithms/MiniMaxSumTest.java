package test.java.algorithms;

import main.java.algorithms.MiniMaxSum;
import org.junit.Test;

import java.util.Arrays;

public class MiniMaxSumTest {

    @Test
    public void test() {
        //Given
        int[] input = {1,2,3,4,5};

        //When & Then
        MiniMaxSum.miniMaxSum(input);
    }

    @Test
    public void test2() {
        Integer[] input =  {7, 3, 4, 5, 6,};
        Arrays.sort(input);

        for (Integer el : input) {
            System.out.println(el);
        }
    }

}