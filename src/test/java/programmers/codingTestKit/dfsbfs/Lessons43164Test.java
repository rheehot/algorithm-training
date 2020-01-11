package test.java.programmers.codingTestKit.dfsbfs;

import main.java.programmers.codingTestKit.dfsbfs.Lessons43164;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-10 6:06 오후
 */
public class Lessons43164Test {

    @Test
    public void test() {
//        String[][] inputs2 = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
//        assertArrayEquals(new String[]{"ICN", "JFK", "HND", "IAD"}, Lessons43164.solution(inputs2));
        String[][] inputs3 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
        assertArrayEquals(new String[]{"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"}, Lessons43164.solution(inputs3));
    }
}