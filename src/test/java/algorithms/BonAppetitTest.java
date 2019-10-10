package test.java.algorithms;

import main.java.algorithms.BonAppetit;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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