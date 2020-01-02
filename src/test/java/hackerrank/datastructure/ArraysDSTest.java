package test.java.hackerrank.datastructure;

import main.java.hackerrank.datastructure.ArraysDS;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysDSTest {

    @Test
    public void test() {
        //Given & When
        int[] reverseArray = ArraysDS.reverseArray(new int[]{1, 4, 3, 2});

        //Then
        assertArrayEquals(new int[]{2, 3, 4, 1}, reverseArray);

    }
}