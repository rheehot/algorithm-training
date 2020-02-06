package hackerrank.interviewkit.StacksAndQueues;

import hackerrank.interviewkit.StacksAndQueues.BalancedBrackets;
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