package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.UtopianTree;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UtopianTreeTest {

    @Test
    public void test() {
        //Given
        int[] input = {0, 1, 4};
        int[] expect = {1, 2, 7};

        int n = 3;
        double pow = 2 * Math.pow(2, (1 - 1));

       // System.out.println("pow = "+pow);

        //When & Then
        for (int i = 0; i < input.length; i++) {
            int result = UtopianTree.utopianTree(input[i]);
            //System.out.println(result);
            assertEquals(expect[i], result);
        }


    }
}