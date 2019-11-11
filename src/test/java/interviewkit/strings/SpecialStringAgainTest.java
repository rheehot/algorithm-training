package test.java.interviewkit.strings;

import main.java.interviewkit.strings.SpecialStringAgain;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialStringAgainTest {

    @Test
    public void test() {
        //Given
        String s = "aabaa";
        //When
        SpecialStringAgain.substrCount(s.length(), s);
        //Then
    }

}