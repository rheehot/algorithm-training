package test.java.programmers.codingTestKit.hash;


import main.java.programmers.codingTestKit.hash.Lessons42576;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lessons42576Test {

    @Test
    public void test() {
        String[] participant ={"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        assertEquals("leo", Lessons42576.solution(participant, completion));
    }


}