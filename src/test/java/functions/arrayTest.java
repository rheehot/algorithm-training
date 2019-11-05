package test.java.functions;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class arrayTest {
    /**
     * https://www.baeldung.com/java-array-copy
     */
    @Test
    public void 배열복사() {
        int[] array = {23, 43, 55, 12, 65, 88, 92};

        int[] copiedArray = Arrays.copyOfRange(array, 1, 4);

        IntStream.of(copiedArray).forEach(v -> System.out.println(v));
    }

    /**
     * https://www.baeldung.com/java-array-min-max
     */
    @Test
    public void 배열에서_가장_큰_값_찾기() {
        int[] array = {23, 43, 55, 12, 65, 88, 92};
        int asInt = Arrays.stream(array).max().getAsInt();
        System.out.println(asInt);
    }
}
