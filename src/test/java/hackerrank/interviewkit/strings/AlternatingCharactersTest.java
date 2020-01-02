package test.java.hackerrank.interviewkit.strings;

import main.java.hackerrank.interviewkit.strings.AlternatingCharacters;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlternatingCharactersTest {

    @Test
    public void test() {
        //Given
        String s = "ABABABAB";

        //When
        int result = AlternatingCharacters.alternatingCharacters(s);
        System.out.println(result);

        //Then
        assertEquals(0, result);
    }
}