package test.java.hackerrank.interviewkit.StacksAndQueues;

import main.java.hackerrank.interviewkit.StacksAndQueues.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void test() {

        assertEquals("YES", BalancedBrackets.isBalanced("{[()]}"));
        assertEquals("NO", BalancedBrackets.isBalanced("{[(])}"));
        assertEquals("NO", BalancedBrackets.isBalanced("{{)[](}}"));

        assertEquals("NO", BalancedBrackets.isBalanced("{{}("));

    }

}