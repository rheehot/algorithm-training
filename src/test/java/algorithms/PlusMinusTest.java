package test.java.algorithms;

import main.java.algorithms.PlusMinus;
import org.junit.Test;

public class PlusMinusTest {

    @Test
    public void test() {
        //Given
        int[] elements = {-4, 3, -9, 0, 4, 1};

        //When
        PlusMinus.plusMinus(elements);

        //Then
    }


    @Test
    public void test2() {
        int a = 1;
        int b = 6;

        System.out.println(1 / (double) b); // 한쪽 값을 실수형으로 캐스팅하고 계산  = 0.16666666666666666

        System.out.println(Math.round((double) a / b * 1000) / 1000.0); // 소숫점 자릿수 만급 곱하고 다시 나눈다
        System.out.println(Math.round(a / (double )b * 1000) / 1000.0); // 소숫점 자릿수 만급 곱하고 다시 나눈다
        System.out.println(String.format("%.3f", a / (double) b)); // %s = 스트링 , %d = 정수, %f = 실수

    }

}