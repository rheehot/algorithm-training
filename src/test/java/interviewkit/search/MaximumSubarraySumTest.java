package test.java.interviewkit.search;

import main.java.interviewkit.search.MaximumSubarraySum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarraySumTest {
    @Test
    public void test() {
        //Given
        //long[] arr = {846930887, 1681692778, 1714636916, 1957747794, 424238336, 719885387, 1649760493, 596516650, 1189641422, 1025202363, 1350490028, 783368691, 1102520060, 2044897764, 1967513927, 1365180541, 1540383427, 304089173, 1303455737, 35005212, 521595369, 294702568, 1726956430, 336465783, 861021531, 278722863, 233665124, 2145174068, 468703136, 1101513930, 1801979803, 1315634023, 635723059, 1369133070, 1125898168, 1059961394, 2089018457, 628175012, 1656478043, 1131176230, 1653377374, 859484422, 1914544920, 608413785, 756898538, 1734575199, 1973594325, 149798316, 2038664371, 1129566414};
        //long mod = 1804289384;
        //long expected = 1802192837;
        long[] arr = {3, 3, 9, 9, 5};
        long mod = 7;
        long expected = 6;
//        long[] arr = {1, 5, 9};
//        long mod = 5;
//        long expected = 4;


        //When
        long result = MaximumSubarraySum.maximumSum(arr, mod);

        //Then
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        //Given
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;

        //When
        int result = MaximumSubarraySum.maxSubArray(nums);

        //Then
        assertEquals(expected, result);
    }
}