package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.ElectronicsShop;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectronicsShopTest {

    @Test
    public void test() {
        //Given
        int[] keyBoard = {3, 1};
        int[] usb = {5, 2, 8};

        //When
        int moneySpent = ElectronicsShop.getMoneySpent(keyBoard, usb, 10);

        //Then
        assertEquals(9, moneySpent);

    }

}