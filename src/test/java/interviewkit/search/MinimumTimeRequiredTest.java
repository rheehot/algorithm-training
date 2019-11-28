package test.java.interviewkit.search;

import main.java.interviewkit.search.MinimumTimeRequired;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MinimumTimeRequiredTest {
    @Test
    public void test() {
        //Given
        //long[] machines = {2, 3, 2};
      long[] machines = {1, 3, 4};
      //  long[] machines = {2, 3};
        //long[] machines = {4, 5, 6};
       //long[] machines = {63, 2, 26, 59, 16, 55, 99, 21, 98, 65};
        int coal = 10;

        //When
        long result = MinimumTimeRequired.minTime(machines, coal);

        //Then
        assertEquals(7, result);
    }

    @Test
    public void test2() {
        double sum = Arrays.stream(new int[]{2, 3}).mapToDouble(v -> (double)7 / v).sum();
        System.out.println(sum);
    }
}