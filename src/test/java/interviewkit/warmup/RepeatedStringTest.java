package test.java.interviewkit.warmup;

import main.java.interviewkit.warmup.RepeatedString;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void test() {
        //Given
        String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        long n = 736778906400L;

        //When
        long result = RepeatedString.repeatedString(s, n);

        //Then
        assertEquals(51574523448L, result);
    }

}