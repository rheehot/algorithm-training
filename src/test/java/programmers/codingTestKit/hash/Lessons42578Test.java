package test.java.programmers.codingTestKit.hash;

import main.java.programmers.codingTestKit.hash.Lessons42578;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lessons42578Test {

    @Test
    public void test() {
        String[][] inputs = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        //String[][] inputs = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        int solution = Lessons42578.solution(inputs);
        System.out.println(solution);
    }
}