package leetcode.topInterViewQuestions.medium.backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimchanjung on 2020-02-19 4:15 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/796/
 * [Subsets]
 * [REMIND]
 * 아주 햇갈리는 문제 dfs를 사용하여 해결 할수 있지만
 * 조합을 어떻게 하느냐가 복잡 ......
 *
 *
 *                          0
 *        1                 2               3            -> 1~3
 *    1+2  1+3            2+3                            -> 2~3
 *  1+2+3                                                -> 3
 *
 */
public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        return dfs(nums, 0, new ArrayList<>(), new ArrayList<>());
    }

    public static List<List<Integer>> dfs(int[] nums, int start, List<List<Integer>> ret, List<Integer> items) {
        ret.add(items);

        for (int i = start; i < nums.length; i++) {
            List<Integer> item = new ArrayList<>(items);
            item.add(nums[i]);
            dfs(nums, i + 1, ret, item);
        }

        return ret;
    }


    public static List<String> subsets2(String str) {
        return dfs2(str, 0, new ArrayList<>(), "");
    }

    public static List<String> dfs2(String str, int start, List<String> ret, String s) {
        ret.add(s);
        //System.out.println(s);
        for (int i = start; i < str.length(); i++) {
            System.out.println(start+"----"+str.charAt(i));
            dfs2(str, i + 1, ret, s + str.charAt(i));
        }

        return ret;
    }

}
