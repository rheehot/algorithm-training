package hackerrank.interviewkit.sorting;

import hackerrank.interviewkit.sorting.MarkAndToys;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarkAndToysTest {
    @Test
    public void test() {
        //Given
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        int price = 50;

        //When
        int result = MarkAndToys.maximumToys(prices, 50);

        //Then
        assertEquals(4 , result);
    }
}