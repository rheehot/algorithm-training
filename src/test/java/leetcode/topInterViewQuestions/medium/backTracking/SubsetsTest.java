package leetcode.topInterViewQuestions.medium.backTracking;

import org.junit.Test;

import java.util.List;

/**
 * Created by kimchanjung on 2020-02-19 4:30 오후
 */
public class SubsetsTest {
    @Test
    public void test() {
        List<List<Integer>> ret = Subsets.subsets(new int[]{1, 2, 3});
        ret.forEach(v -> System.out.println(v));
    }

    @Test
    public void test2() {
        List<String> ret = Subsets.subsets2("123");
        ret.forEach(v -> System.out.println(v));
    }

}