package leetcode.topInterViewQuestions.medium.backTracking;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-11 5:15 오후
 */
public class GenerateParenthesesSolutionTest {

    @Test
    public void test() {
        GenerateParenthesesSolution.generateParenthesis(3).forEach(v -> System.out.println(v));
    }
}