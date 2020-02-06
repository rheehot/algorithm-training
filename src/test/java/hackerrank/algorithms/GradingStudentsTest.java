package hackerrank.algorithms;

import hackerrank.algorithms.GradingStudents;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GradingStudentsTest {

    @Test
    public void test() {
        //Given
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);

        //When
        List<Integer> roundedGrades = GradingStudents.gradingStudents(grades);

        //Then
        assertEquals(Arrays.asList(75,67,40,33), roundedGrades);
    }

}