package test.java.algorithms;

import main.java.algorithms.TimeConversion;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TimeConversionTest {

    @Test
    public void test() {
        //Given
        String time = "12:45:54PM";

        //When
        String militaryTime = TimeConversion.timeConversion(time);
        System.out.println(militaryTime);

        //Then
        assertThat("time is", militaryTime, is("12:45:54"));
    }

    @Test
    public void test2() {
        StringBuilder s = new StringBuilder("07:00:00PM");
        System.out.println(s.substring(1,3));
        System.out.println(Integer.parseInt(s.substring(0, 2)));
        System.out.println(Integer.valueOf(s.substring(0, 2)));
    }

    @Test
    public void test3() {
        String time = "12:45:54PM";
        int hour = Integer.parseInt(time.substring(0,2)) % 12;

        System.out.println(hour);
    }

}