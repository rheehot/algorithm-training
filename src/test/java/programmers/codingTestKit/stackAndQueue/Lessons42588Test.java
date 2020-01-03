package test.java.programmers.codingTestKit.stackAndQueue;

import main.java.programmers.codingTestKit.stackAndQueue.Lessons42588;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Lessons42588Test {

    @Test
    public void test() {
        int[] solution = Lessons42588.solution(new int[]{3, 9, 9, 3, 5, 7, 2});

        Arrays.stream(solution).forEach(v -> System.out.printf(v+" "));
    }

}