package leetcode.topInterViewQuestions.medium.dynamicPrograming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-20 1:41 오후
 */
public class LongestIncreasingSubsequenceTest {

    @Test
    public void test() {
        assertEquals(4, LongestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}