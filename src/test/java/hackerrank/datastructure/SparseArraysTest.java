package test.java.hackerrank.datastructure;

import main.java.datastructure.SparseArrays;
import org.junit.Test;

import static org.junit.Assert.*;

public class SparseArraysTest {

    @Test
    public void test() {
        //Given
        String[] data = new String[]{"def", "de", "fgh"};
        String[] query = new String[]{"de", "lmn", "fgh"};
        int[] expected = {1, 0, 1};

        //When
        int[] result = SparseArrays.matchingStrings(data, query);

        //Then
        assertArrayEquals(expected, result);
    }

}