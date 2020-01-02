package test.java.hackerrank.interviewkit.miscellaneous;

import main.java.hackerrank.interviewkit.miscellaneous.TimeComplexityPrimality;
import org.junit.Test;

public class TimeComplexityPrimalityTest {

    @Test
    public void test() {

        int[] input = {1
                , 4
                , 9
                , 16
                , 25
                , 36
                , 49
                , 64
                , 81
                , 100
                , 121
                , 144
                , 169
                , 196
                , 225
                , 256
                , 289
                , 324
                , 361
                , 400
                , 441
                , 484
                , 529
                , 576
                , 625
                , 676
                , 729
                , 784
                , 841
                , 907};
        for (int i = 0; i < input.length ; i++) {
            String primality = TimeComplexityPrimality.primality(input[i]);
            System.out.println(primality);
        }



    }
}