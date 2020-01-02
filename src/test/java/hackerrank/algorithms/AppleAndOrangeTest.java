package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.AppleAndOrange;
import org.junit.Test;

public class AppleAndOrangeTest {

    @Test
    public void test() {
        //Given
        int samHouseStart = 7, samHouseEnd = 11,  appleTreeLocation = 5, orangeTreeLocation = 15;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        //When & Then
        AppleAndOrange.countApplesAndOranges(samHouseStart, samHouseEnd, appleTreeLocation, orangeTreeLocation, apples, oranges);
    }

}