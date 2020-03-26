package codility.lessons.maximumSliceProblem;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-10 2:38 오후
 */
public class MaxDoubleSliceSumTest {

    @Test
    public void test() {
        assertEquals(17, MaxDoubleSliceSum.solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2}));
    }
}