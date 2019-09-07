package test.java.datastructure;

import main.java.datastructure.TwoDArrayDS;
import org.junit.Test;

import java.util.Vector;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TwoDArrayDSTest {



    public int[][] getData(int len, String[] input) {
        int[][] arr = new int[len][len];

        for (int i = 0; i < arr.length; i++) {
            String[] arrRowItems = input[i].split(" ");
            for (int j = 0; j < arr.length; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        return arr;
    }

    @Test
    public void test() {
        //Given
        String[] input = {"-1 1 -1 0 0 0", "0 -1 0 0 0 0", "-1 -1 -1 0 0 0", "0 -9 2 -4 -4 0", "-7 0 0 -2 0 0","0 0 -1 -2 -4 0"};
        int[][] param = getData(input.length, input);

        //When
        int sum = TwoDArrayDS.hourglassSum(param);

        //Then
        assertThat("sum is ", sum, is(0));

    }

}