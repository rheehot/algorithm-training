package leetcode.topInterViewQuestions.medium.arrayAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-17 4:04 오후
 */
public class LongestPalindromicSubstringTest {
    @Test
    public void test() {
        assertEquals("anana", LongestPalindromicSubstring.longestPalindrome("bananac"));
        assertEquals("bab", LongestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
    }
}