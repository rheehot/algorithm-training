package hackerrank.interviewkit.stringManipulation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonChildTest {
    @Test
    public void test() {
        assertEquals(2, CommonChild.commonChild("HARRY", "SALLY"));
        assertEquals(3, CommonChild.commonChild("SHINCHAN", "NOHARAAA"));
    }
}