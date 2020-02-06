package hackerrank.algorithms;

import hackerrank.algorithms.Staircase;
import org.junit.Test;

public class StaircaseTest {

    @Test
    public void test() {
        //Given
        int input = 6;

        //When & Then
        Staircase.staircase(input);
    }

    @Test
    public void test2() {
        System.out.println(String.format("%5s", "#", "S"));
    }

    @Test
    public void test3() {
        String str = "ABCDEF";
        System.out.println(str.indexOf("B"));
        System.out.println(str.concat("GGG"));
        System.out.println(str.subSequence(1,2));
        System.out.println(str.replace("A", "Z"));
        System.out.println(str.replaceAll("C", "Z"));

        StringBuilder strb = new StringBuilder("ABCDEF");
        System.out.println(strb.append("Z"));
        System.out.println(strb.append("ZZ", 1,2));
        System.out.println(strb.replace(1,3, "Z"));
        System.out.println(strb.insert(1,"X"));


        System.out.println(String.format("%" + 5 + "s", "A"));



    }

}