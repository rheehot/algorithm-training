package test.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void test() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "A");
        map.put(1, "B");
        map.put(1, "C");

        for (String value : map.values()) {
            System.out.print(value + " ");
        }
    }
}
