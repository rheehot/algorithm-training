package test.java.leetcode.topInterViewQuestions.medium.arrayAndStrings;


import main.java.leetcode.topInterViewQuestions.medium.arrayAndStrings.ThreeSum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-02 4:55 오후
 */
public class ThreeSumTest {

    @Test
    public void test() {
        assertThat(ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}), is(Arrays.asList(Arrays.asList(-1, -1, 2),Arrays.asList(-1, 0, 1))));
        assertThat(ThreeSum.threeSum(new int[]{0,0,0,0}), is(Arrays.asList(Arrays.asList(0,0,0))));
        assertThat(ThreeSum.threeSum(new int[]{-2,0,1,1,2}), is(Arrays.asList(Arrays.asList(-2,0,2),Arrays.asList(-2, 1, 1))));
    }
}