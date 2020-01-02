package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.CompareTheTriplets;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CompareTheTripletsTest {
    @Test
    public void test() {
        //Given
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);

        //When
        List<Integer> results = CompareTheTriplets.compareTriplets(a, b);
        results.forEach(v -> System.out.println(v));

        //Then
        assertThat("Alice's points is : ", results.get(0), is(2));
        assertThat("Bob's points is : ", results.get(1), is(1));
    }


    @Test
    public void test2() {
        Integer a = 1;
        Integer b = 1;

        System.out.println(a.compareTo(b));
    }
}