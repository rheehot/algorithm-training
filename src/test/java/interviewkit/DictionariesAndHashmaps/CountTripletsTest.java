package test.java.interviewkit.DictionariesAndHashmaps;

import main.java.interviewkit.DictionariesAndHashmaps.CountTriplets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CountTripletsTest {

    @Test
    public void test() {
        //Given
        List<Long> inputs = new ArrayList(Arrays.asList(1L, 5L, 5L, 25L, 125L));
        //List<Long> inputs = new ArrayList(Arrays.asList(1237L, 1237L, 1237L, 1237L, 1237L));

        long ratio = 5;
        //When
        CountTriplets.countTriplets(inputs, ratio);
        //Then
    }

}