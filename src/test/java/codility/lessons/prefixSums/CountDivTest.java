package codility.lessons.prefixSums;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-06 3:42 오후
 */
public class CountDivTest {

    @Test
    public void test() {
        assertEquals(3, CountDiv.solution(6, 11, 2));
        assertEquals(20, CountDiv.solution(11, 345, 17));
        assertEquals(1, CountDiv.solution(0, 0, 11));
        assertEquals(0, CountDiv.solution(1, 1, 11));
        assertEquals(1, CountDiv.solution(10, 10, 5));
        assertEquals(0, CountDiv.solution(10, 10, 7));
    }
}