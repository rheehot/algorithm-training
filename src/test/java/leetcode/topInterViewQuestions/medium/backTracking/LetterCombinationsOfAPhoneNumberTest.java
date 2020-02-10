package leetcode.topInterViewQuestions.medium.backTracking;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-10 3:28 오후
 */
public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void test() {
        System.out.println("[\"ad\", \"ae\", \"af\", \"bd\", \"be\", \"bf\", \"cd\", \"ce\", \"cf\"]");
        LetterCombinationsOfAPhoneNumber.letterCombinations("23");
        LetterCombinationsOfAPhoneNumber.letterCombinations("");
    }
}