package hackerrank.algorithms;

import hackerrank.algorithms.MigratoryBirds;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MigratoryBirdsTest {

    @Test
    public void test() {
        //Given
        List<Integer> inputs = Arrays.asList(2, 4, 3, 2, 3, 1, 2, 1, 3, 3);

        //When
        int migratoryBirds = MigratoryBirds.migratoryBirds(inputs);

        //Then
        assertEquals(3, migratoryBirds);

    }

}