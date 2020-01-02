package test.java.hackerrank.interviewkit.strings;

import main.java.hackerrank.interviewkit.strings.MakingAnagrams;
import org.junit.Test;

import static org.junit.Assert.*;

public class MakingAnagramsTest {
    @Test
    public void test() {
        //Given
        String a = "cde";
        String b = "abc";
        //When
        int result = MakingAnagrams.makeAnagram(a, b);

        //Then
        assertEquals(4, result);

    }

}