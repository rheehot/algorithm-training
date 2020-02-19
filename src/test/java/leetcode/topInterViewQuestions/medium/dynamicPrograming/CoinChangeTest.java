package leetcode.topInterViewQuestions.medium.dynamicPrograming;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-14 5:27 오후
 */
public class CoinChangeTest {
    @Test
    public void test() {
        assertEquals(3, CoinChange.coinChange(new int[]{1, 2, 5}, 11));
        assertEquals(-1, CoinChange.coinChange(new int[]{2}, 3));
        assertEquals(-1, CoinChange.coinChange(new int[]{2}, 1));
        assertEquals(4, CoinChange.coinChange(new int[]{2, 5, 10, 1}, 27));
    }
}