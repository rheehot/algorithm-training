package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.BonAppetit;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BonAppetitTest {

    @Test
    public void test() {
        //Given
        List<Integer> bill = Arrays.asList(3, 10, 2, 9);
        int k = 1;
        int b = 7;

        //When
        BonAppetit.bonAppetit(bill, k, b);
        //Then
    }

}