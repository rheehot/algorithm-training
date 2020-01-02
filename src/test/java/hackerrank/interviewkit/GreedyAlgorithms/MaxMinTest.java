package test.java.hackerrank.interviewkit.GreedyAlgorithms;

import main.java.hackerrank.interviewkit.GreedyAlgorithms.MaxMin;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinTest {

    @Test
    public void test() {
        //Given
        int[] input = {4504
                ,1520
                ,5857
                ,4094
                ,4157
                ,3902
                ,822
                ,6643
                ,2422
                ,7288
                ,8245
                ,9948
                ,2822
                ,1784
                ,7802
                ,3142
                ,9739
                ,5629
                ,5413
                ,7232};

        //When
        int result = MaxMin.maxMin(5, input);

        //Then
        assertEquals(1335, result);
    }
}