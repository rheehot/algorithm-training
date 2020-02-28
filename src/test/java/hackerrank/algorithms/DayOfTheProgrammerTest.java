package hackerrank.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheProgrammerTest {

    @Test
    public void test() {
        //Given
        int year = 2100;

        //When
        String dayOfProgrammer = DayOfTheProgrammer.dayOfProgrammer(year);
        System.out.println(dayOfProgrammer);

        System.out.println(2100%100);
        //Then
        assertEquals("13.09.2100", dayOfProgrammer);

    }

}