package leetcode.topInterViewQuestions.medium.backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimchanjung on 2020-02-04 4:00 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/793/
 * [Letter Combinations of a Phone Number]
 *
 * 기본적으로 DFS를 활용하는 문제이지만 주어진 데이터를 어떻게 구성해서 풀어나갈지가 처음에 감이 잘 안오는 문제였음
 *
 */
public class LetterCombinationsOfAPhoneNumber {

    private static String[] nodes = new String[]{"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private static int[] nums;
    private static List<String> ret;

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        ret =  new ArrayList<>();
        nums = digits.chars().map(v -> v - 50).toArray();
        dfs(0, "");
        return ret;
    }

    private static void dfs(int index, String str) {
        if (nums.length == index) {
            ret.add(str);
            return;
        }

        for (char c : nodes[nums[index]].toCharArray()) {
            dfs(index + 1, str + c);
        }
    }
}
