package test.java.algorithms;

import main.java.algorithms.BirthdayCakeCandles;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BirthdayCakeCandlesTest {

    @Test
    public void test() {
        //Given
        int[] elements = {3, 2, 1, 3};

        //When
        int results = BirthdayCakeCandles.birthdayCakeCandles(elements);
        System.out.println(results);

        //Then
        assertThat("result is : ",results, is(2));
    }

}