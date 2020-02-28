package hackerrank.interviewkit.stringManipulation;

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