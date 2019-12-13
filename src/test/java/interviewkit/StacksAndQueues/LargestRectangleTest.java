package test.java.interviewkit.StacksAndQueues;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class LargestRectangleTest {

    @Test
    public void test() {
        //Given
        //When
        assertEquals(9, LargestRectangle.largestRectangle(new int[]{1, 2, 3, 5, 4}));
        //Then
    }
}