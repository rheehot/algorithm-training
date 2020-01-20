package test.java.programmers.codingTestKit.stackAndQueue;

import main.java.programmers.codingTestKit.stackAndQueue.Lessons42586;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-20 3:48 오후
 */
public class Lessons42586Test {

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{2, 1}, Lessons42586.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
        Assert.assertArrayEquals(new int[]{1,2,3}, Lessons42586.solution(new int[]{40, 93, 30, 55, 60, 65}, new int[]{60, 1, 30, 5, 10, 7}));
        Assert.assertArrayEquals(new int[]{2, 4}, Lessons42586.solution(new int[]{93, 30, 55, 60, 40, 65}, new int[]{1, 30, 5 , 10, 60, 7}));
        Assert.assertArrayEquals(new int[]{3}, Lessons42586.solution(new int[]{5, 5, 5}, new int[]{21, 25, 20}));

    }
}