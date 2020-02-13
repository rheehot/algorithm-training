package leetcode.topInterViewQuestions.medium.arrayAndStrings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-13 2:48 오후
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test() {
        String a = "abcdb";
        //System.out.println(a.lastIndexOf("b"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("f"));
        assertEquals(0, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
        assertEquals(2, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
    }
}