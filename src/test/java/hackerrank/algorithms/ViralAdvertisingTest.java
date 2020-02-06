package hackerrank.algorithms;

import hackerrank.algorithms.ViralAdvertising;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViralAdvertisingTest {

    @Test
    public void test() {
        //Given
        //When
        int result = ViralAdvertising.viralAdvertising(34);


        //Then
        assertEquals(3149621 , result);
    }
}