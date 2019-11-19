package test.java.interviewkit.GreedyAlgorithms;

import main.java.interviewkit.GreedyAlgorithms.LuckBalance;
import org.junit.Test;

import static org.junit.Assert.*;

public class LuckBalanceTest {

    @Test
    public void test() {
        //Given
        int[][] input =
                {{5, 1},
                        {2, 1
                        }, {
                        1, 1
                }, {
                        8, 1
                }, {10, 0},
                        {
                                5, 0
                        }};
        //When
        int result = LuckBalance.luckBalance(3, input);

        //Then
        assertEquals(29, result);
    }
}