package test.java.hackerrank.interviewkit.sorting;

import main.java.hackerrank.interviewkit.sorting.FraudulentActivityNotifications;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraudulentActivityNotificationsTest {

    @Test
    public void test() {
        //Given
        //int[] expenditure = {2, 3, 4, 2, 3, 6, 8, 4, 5};
        //int[] expenditure = {5, 4, 8, 6, 3, 2, 4, 3, 2};
       // int[] expenditure = {10, 20, 30, 40, 50};
        int[] expenditure = {1, 2, 3, 4, 4};




        //When
        int result = FraudulentActivityNotifications.activityNotifications(expenditure, 4);

        //Then
        assertEquals(0, result);
    }

}