package codility.lessons.primeAndCompositeNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-10 3:55 오후
 */
public class CountFactorsTest {

    @Test
    public void test() {
        assertEquals(8, CountFactors.solution(24));
        assertEquals(5, CountFactors.solution(16));
    }
}