package test.java.smallFunctions;

import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by kimchanjung on 2020-01-14 5:17 오후
 */
public class PrimeNumberTest {

    @Test
    public void test() {
        BigInteger b = new BigInteger(String.valueOf(6));
        System.out.println(b.isProbablePrime(1));
    }
}
