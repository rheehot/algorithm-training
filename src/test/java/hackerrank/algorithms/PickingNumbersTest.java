package hackerrank.algorithms;

import hackerrank.algorithms.PickingNumbers;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class PickingNumbersTest {

    @Test
    public void test() {
        //Given
        List<Integer> items = new LinkedList<>(Arrays.asList(10, 12, 11, 3, 3, 1));

        //When
        int result = PickingNumbers.pickingNumbers(items);

        //Then
        assertEquals(2, result);
    }

}