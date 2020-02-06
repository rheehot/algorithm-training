package hackerrank.algorithms;

import hackerrank.algorithms.DrawingBook;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrawingBookTest {

    @Test
    public void test() {
        //Given
        int numberOfPage = 5;
        int wantPage = 4;

        //When
        int result = DrawingBook.pageCount(numberOfPage, wantPage);
       // System.out.println(result);

        System.out.println(1 & 2);

        //Then
        assertEquals(0, result);

    }

}