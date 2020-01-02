package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.SockMerchant;
import org.junit.Test;

import static org.junit.Assert.*;

public class SockMerchantTest {

    @Test
    public void test() {
        //Given
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        //When
        int pairNum = SockMerchant.sockMerchant(socks.length, socks);

        //Then
        assertEquals(3, pairNum);
    }

}