package test.java.interviewkit.GreedyAlgorithms;

import main.java.interviewkit.GreedyAlgorithms.GreedyFlorist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreedyFloristTest {
    @Test
    public void test() {
        //Given
        int[] input = {1, 3, 5, 7, 9};
        int peopleNum = 3;

        //When
        int minimumCost = GreedyFlorist.getMinimumCost(peopleNum, input);

        //Then
        assertEquals(29, minimumCost);
    }

}