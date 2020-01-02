package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.AngryProfessor;
import org.junit.Test;

import static org.junit.Assert.*;

public class AngryProfessorTest {

    @Test
    public void test() {
        //Given
        int leastStudent = 3;
        int[] arrivedTimes = {-1, -3, 4, 2};
        //When
        String result = AngryProfessor.angryProfessor(leastStudent, arrivedTimes);

        //Then
        assertEquals("YES", result);
    }

}