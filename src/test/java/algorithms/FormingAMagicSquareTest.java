package test.java.algorithms;

import main.java.algorithms.FormingAMagicSquare;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormingAMagicSquareTest {

    @Test
    public void test() {
        //Given
        int[][] matrix = {{4, 9, 2},
                {3, 5, 7},
                {8, 1, 5}};

        //When
        int formingMagicSquare = FormingAMagicSquare.formingMagicSquare(matrix);

        //Then
    }
}