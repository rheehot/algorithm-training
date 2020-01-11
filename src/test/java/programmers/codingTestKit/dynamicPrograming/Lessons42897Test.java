package test.java.programmers.codingTestKit.dynamicPrograming;

import main.java.programmers.codingTestKit.dynamicPrograming.Lessons42897;
import org.junit.Test;

import javax.sound.midi.Soundbank;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Lessons42897Test {

    @Test
    public void test() {
        int[] money = {1, 2, 3, 1};

        assertEquals(4, Lessons42897.solution(money));
    }
}