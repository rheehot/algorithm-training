package test.java.datastructure;

import main.java.datastructure.LeftRotation;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void test() {
        //Given
        int n = 4;
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};

        //When
        int[] result = LeftRotation.leftRotation(n, input);

        //Then
        assertArrayEquals(expected, result);
    }

}