package test.java.interviewkit.DictionariesAndHashmaps;

import main.java.interviewkit.DictionariesAndHashmaps.SherlockAndAnagrams;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SherlockAndAnagramsTest {

    @Test
    public void test() {
        //Given
        String input = "aaaaaaa";
        //When
        int result = SherlockAndAnagrams.sherlockAndAnagrams(input);

        //Then
        assertEquals(56 , result);
    }


    @Test
    public void test2() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("a", 2);

        System.out.println(map.get("d"));
    }

}