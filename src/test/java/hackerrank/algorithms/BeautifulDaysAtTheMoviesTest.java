package hackerrank.algorithms;

import hackerrank.algorithms.BeautifulDaysAtTheMovies;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeautifulDaysAtTheMoviesTest {

    @Test
    public void test() {
        //Given
        int startDay = 13;
        int endDay = 45;
        int divisor = 3;


        //When
        int result = BeautifulDaysAtTheMovies.beautifulDays(startDay, endDay, divisor);

        //Then
        assertEquals(33 , result);
    }

}