package codility.lessons.countingElements;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-05 6:30 오후
 */
public class FrogRiverOneTest {

    @Test
    public void test() {
        assertEquals(6, FrogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}