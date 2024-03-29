package hackerrank.interviewkit.RecursionAndBacktracking;

import hackerrank.interviewkit.RecursionAndBacktracking.DavisStaircase;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class DavisStaircaseTest {

    @Test
    public void test() {
        int num = DavisStaircase.stepPerms(7);
        System.out.println(num);
        assertEquals(44, num);
    }

    @Test
    public void test2() {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.putIfAbsent(1,2));
    }
}