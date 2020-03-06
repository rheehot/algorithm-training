package codility.lessons.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-06 4:52 오후
 */
public class distinctTest {

    @Test
    public void test() {
        assertEquals(3, distinct.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }
}