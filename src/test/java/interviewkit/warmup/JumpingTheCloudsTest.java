package test.java.interviewkit.warmup;

import main.java.interviewkit.warmup.JumpingTheClouds;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpingTheCloudsTest {

    @Test
    public void test() {
        //Given
        int[] inputs = {0, 0, 1, 0, 0, 1, 0};

        //When
        int result = JumpingTheClouds.jumpingOnClouds(inputs);

        //Then
        assertEquals(4 ,result);
    }

}