package test.java.algorithms;

import main.java.algorithms.TheHurdleRace;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheHurdleRaceTest {

    @Test
    public void test() {
        //Given
        int k = 4;
        int[] height = {1, 6, 3, 5, 2};

        //When
        int result = TheHurdleRace.hurdleRace(4, height);

        //Then
        assertEquals(2, result);
    }

}