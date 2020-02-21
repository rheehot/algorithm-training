package leetcode.topInterViewQuestions.medium.arrayAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-21 2:23 오후
 */
public class IncreasingTripletSubsequenceTest {

    @Test
    public void test() {
        assertEquals(true, IncreasingTripletSubsequence.increasingTriplet(new int[]{2, 1, 3, 4, 5}));
        assertEquals(false, IncreasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 2, 1}));
    }
}