package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-19 7:25 오후
 */
public class FindPeakElementTest {

    @Test
    public void test() {
        assertEquals(2, FindPeakElement.findPeakElement(new int[]{1, 2, 3, 1}));
        assertEquals(1, FindPeakElement.findPeakElement(new int[]{1,2,1,3,5,6,4}));
        assertEquals(1, FindPeakElement.findPeakElement(new int[]{1,2}));
    }
}