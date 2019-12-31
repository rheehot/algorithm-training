package test.java.interviewkit.miscellaneous;

import main.java.interviewkit.miscellaneous.FlippingBits;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlippingBitsTest {

    @Test
    public void test() {
        long l = FlippingBits.flippingBits(1);
       // System.out.println(l);

        String result = Long.toBinaryString( Integer.toUnsignedLong(1) | 0x100000000L ).substring(1);
        System.out.println(result);

        System.out.println(Long.parseLong("00000000000000000000000000000001", 10));

    }
}