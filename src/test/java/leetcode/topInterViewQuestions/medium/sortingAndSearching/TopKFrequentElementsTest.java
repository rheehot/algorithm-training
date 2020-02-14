package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-14 3:05 오후
 */
public class TopKFrequentElementsTest {
    @Test
    public void test() {
        List<Integer> integers = TopKFrequentElements.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        System.out.println(integers);
    }
}