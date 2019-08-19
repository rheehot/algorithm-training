package test.java.algorithms;

import main.java.algorithms.DiagonalDifference;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DiagonalDifferenceTest {

    @Test
    public void test() {
        //Given
        List<List<Integer>> squareMatrix  = new ArrayList<List<Integer>>(){{
            add(Arrays.asList(11, 2, 4));
            add(Arrays.asList(4, 5, 6));
            add(Arrays.asList(10, 8, -12));
        }};

        //When
        int result = DiagonalDifference.diagonalDifference(squareMatrix);

        //Then
        assertThat("result is : ", result, is(15));
    }
}