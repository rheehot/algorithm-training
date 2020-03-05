package codility.lessons.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-05 4:48 오후
 */
public class CyclicRotationTest {

    @Test
    public void test() {
        CyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3);
        CyclicRotation.solution(new int[]{1, 2, 3, 4}, 4);
    }
}