package test.java.hackerrank.interviewkit.search;

import main.java.hackerrank.interviewkit.search.MakingCandies;
import org.junit.Test;

import static org.junit.Assert.*;

public class MakingCandiesTest {

    @Test
    public void test() {
        //Given
        //When

        assertEquals(3, MakingCandies.minimumPasses2(3, 1, 2, 12));
        assertEquals(16, MakingCandies.minimumPasses2(1, 1, 6, 45));
        assertEquals(1, MakingCandies.minimumPasses2(5184889632L, 5184889632L, 20, 10000));
        assertEquals(1000000000000L, MakingCandies.minimumPasses2(1, 1, 1000000000000L, 1000000000000L));
        assertEquals(617737754, MakingCandies.minimumPasses2(1, 100, 10000000000L, 1000000000000L));
        assertEquals(1, MakingCandies.minimumPasses2(123456789012L, 215987654321L, 50000000000L, 1000000000000L));
        assertEquals(10, MakingCandies.minimumPasses2(3, 13, 13, 1000000000000L));

    }

    @Test
    public void test2() {
        System.out.println(6/1);

    }
}