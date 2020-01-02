package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.BetweenTwoSets;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BetweenTwoSetsTest {

    @Test
    public void 최대공약수_최소공배수가_정상적으로_계산된다() {
        //Given

        //Given & When
        int gcd1 = BetweenTwoSets.getGCD(2, 4);
        int gcd2 = BetweenTwoSets.getGCD(16, 32);
        int lcm1 = BetweenTwoSets.getLCM(2, 4);
        int lcm2 = BetweenTwoSets.getLCM(16, 32);
        int lcm3 = BetweenTwoSets.getLCM(lcm2, 96);

        //Then
        assertThat("2, 4 최대공약수는 = ", gcd1, is(2));
        assertThat("16, 32 최대공약수는 = ", gcd2, is(16));
        assertThat("2, 4 최소공배수는 = ", lcm1, is(4));
        assertThat("16, 32 최소공배수 = ", lcm2, is(32));
        assertThat("16, 32, 96 최소공배수 = ", lcm3, is(96));
    }

    @Test
    public void 최대공약수_최소공배수가_정상적으로_계산된다2() {
        //Given

        //Given & When
        int lcm = BetweenTwoSets.getLCM(1, 1);
        int gcd = BetweenTwoSets.getGCD(0, 100);

        System.out.println(lcm);
        System.out.println(gcd);
    }

    @Test
    public void test() {
        //Given
        List<Integer> a = Arrays.asList(1);
        List<Integer> b = Arrays.asList(100);

        //When
        int totalX = BetweenTwoSets.getTotalX(a, b);

        //Then
        assertThat("a의 모든 배수 이면서 , b의 모든 약수의 개수는", totalX, is(9) );
    }

}