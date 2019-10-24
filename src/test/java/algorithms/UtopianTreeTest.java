package test.java.algorithms;

import main.java.algorithms.TimeConversion;
import main.java.algorithms.UtopianTree;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UtopianTreeTest {

    @Test
    public void test() {
        //Given
        int[] input = {0, 1, 4};
        int[] expect = {1, 2, 7};


        //When & Then
        for (int i = 0; i < input.length; i++) {
            int result = UtopianTree.utopianTree(input[i]);
            assertEquals(expect[i], result);
        }


    }
}