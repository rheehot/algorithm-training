package test.java.hackerrank.datastructure;

import main.java.hackerrank.datastructure.ArrayManipulation;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayManipulationTest {

    @Test
    public void test() {
        //Given
        int indexSize = 5;
        int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};

        //When
        long result = ArrayManipulation.arrayManipulation(indexSize, queries);

        //Then
        assertThat("result = ", result, is(200L));
    }


    @Test
    public void test2() {
        int arr[] = { 0,1,2,3,4,5,6,7,8,9 };
        int sum[] = new int[10];

        for (int i = 0; i < 10; i++)
        {
            if (i == 0)
                sum[i] = arr[i];
            else
                sum[i] = sum[i - 1] + arr[i];
        }


        for (int item: sum
             ) {
            System.out.println("item = "+item);
        }


        for (int i = 0; i < 1; i++)
        {
            int a =2, b =3;


            System.out.println("b - a = " + (sum[b] - sum[a - 1]));
        }



    }

}