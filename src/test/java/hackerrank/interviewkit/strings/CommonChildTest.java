package test.java.hackerrank.interviewkit.strings;

import main.java.hackerrank.interviewkit.strings.CommonChild;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommonChildTest {
    @Test
    public void test() {
        //Given
        String s1 = "HARRY";
        String s2 = "SALLY";
        int expected = 2;
        //When
        int result = CommonChild.commonChild(s1, s2);

        //Then
        assertEquals(expected, result);
    }
}