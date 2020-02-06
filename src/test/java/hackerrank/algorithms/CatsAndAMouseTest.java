package hackerrank.algorithms;

import hackerrank.algorithms.CatsAndAMouse;
import org.junit.Test;

import static org.junit.Assert.*;


public class CatsAndAMouseTest {

    @Test
    public void test() {
        //Given & When
        String result = CatsAndAMouse.catAndMouse(1, 2, 3);
        String result2 = CatsAndAMouse.catAndMouse(1, 3, 2);

        //Then
        assertEquals("Cat B", result);
        assertEquals("Mouse C", result2);
    }

}