package test.java.algorithms;

import main.java.algorithms.AveryBigSum;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AveryBigSumTest {

    @Test
    public void test() {
        //Given
        long[] elements = {1001458909, 1004570889, 1007019111, 1003302837, 1002514638, 1006431461, 1002575010, 1007514041, 1007548981, 1004402249};

        //When
        long results = AveryBigSum.aVeryBigSum(elements);
        System.out.println("result : "+ results);

        //Then
        assertThat("sum is :", results, is(10047338126L));
    }

}