package codility.lessons.learder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-09 3:39 오후
 */
public class DominatorTest {

    @Test
    public void test() {
        assertEquals(0, Dominator.solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
        assertEquals(-1, Dominator.solution(new int[]{}));
    }
}