package test.java.hackerrank.interviewkit.DictionariesAndHashmaps;

import main.java.hackerrank.interviewkit.DictionariesAndHashmaps.TwoStrings;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringsTest {

    @Test
    public void test() {
        //Given
        String s1 = "wouldyoulikefries";
        String s2 = "abcabcabcabcabcabc";

        //When
        String result = TwoStrings.twoStrings(s1, s2);

        //Then
        assertEquals("NO", result);
    }

}