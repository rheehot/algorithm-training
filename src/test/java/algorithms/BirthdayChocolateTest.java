package test.java.algorithms;

import main.java.algorithms.BirthdayChocolate;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BirthdayChocolateTest {

    @Test
    public void test() {
        //Given
        List<Integer> squiresOfChocolate = Arrays.asList(5, 5, 3, 2, 2, 2, 1, 2, 5, 3, 5, 5, 4, 3, 3, 5);
        int birthDay = 13;
        int birthMonth = 3;

        //When
        int result = BirthdayChocolate.birthday(squiresOfChocolate, birthDay, birthMonth);

        //Then
        assertThat("result is", result, is(3));
    }

    @Test
    public void test2() {
        List<Integer> squiresOfChocolate = Arrays.asList(1, 2, 1, 3, 2);
        List<Integer> integers = squiresOfChocolate.subList(1, 3);

        integers.stream().forEach(v -> System.out.println("a = " + v));


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = list.stream()
                .reduce(0, (a, b) -> {
                    System.out.println(a + ", " + b);
                    return a + b;
                });

        System.out.println("reduce sum : " + sum);

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum2 = list2.stream().reduce(0, Integer::sum);

        System.out.println("reduce sum2 : "+sum2);

    }

}