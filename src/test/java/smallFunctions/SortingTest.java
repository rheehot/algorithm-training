package test.java.smallFunctions;

import org.junit.Test;

/**
 * https://www.baeldung.com/java-sorting-arrays
 */
public class SortingTest {

    @Test
    public void test() {
        String a = "a";
        String b = "b";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(b.compareTo(b));
    }
}
