package leetcode.topInterViewQuestions.medium.backTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimchanjung on 2020-02-11 5:14 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/794/
 * [Generate Parentheses Solution]
 * [REMIND]
 * 원리를 이해하기 어려운 문제..
 * 일단 점화식 즉 조건을 세운다음 조건을 코드로 표현 해보자
 *
 * 점화식은 아래와 같다.
 * "(", ")" 각각 둘다 n개를 다 소진 했으면 종료
 * "(" n 개가 되어야 하고 n 개 를 다 소진 하기 전까지만 추가 가능
 * ")" 는 "(" 추가한 개수 보다 적을 때만 추가가 가능
 *
 *
 *
 */
public class GenerateParenthesesSolution {

    public static List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        dfs(0,0, "", ret);
        return ret;
    }

    private static void dfs(int open, int close, String str, List<String> ret) {
        if (open == 0 && close == 0) {
            ret.add(str);
            return;
        }

        if (open > 0) dfs(open - 1, close, str+"(", ret);

        if (open < close) dfs(open , close-1, str+")", ret);
    }
}
