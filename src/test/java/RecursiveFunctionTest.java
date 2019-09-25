package test.java;

import org.junit.Test;

public class RecursiveFunctionTest {

    public int testFunction(int a) {

        if (a < 5) {

            System.out.println("be a = "+a);
            a = testFunction(a+1);
            System.out.println("af a = "+a);
        }
        System.out.println("dddddddddd a = "+a);
        return a;
    }

    @Test
    public void test() {
        int i = testFunction(1);
       // System.out.println(i);
    }
}
