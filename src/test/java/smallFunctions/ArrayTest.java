package smallFunctions;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayTest {

    @Test
    public void 배열선언후_특정값_전부_채우기() {
        int[] arr = new int[10];
        Arrays.fill(arr, 1);
    }

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

    @Test
    public void 스트림_배열에서_절대값_합산_하기() {
        int[] arr = {1, 2, -3, 4 - 5, 10};
        int sum = Arrays.stream(arr).map(Math::abs).sum();
        System.out.println(sum);
    }

    @Test
    public void CHAR_배열_스트림() {
        String s = "AAAAAAAA";
        s.chars().forEach(v -> System.out.println((char) v));
    }

    /**
     * https://mkyong.com/java/java-how-to-join-arrays/
     */
    @Test
    public void 두배열_합치기() {
        int[] a = {1, 2, 3};
        int[] b = {3, 5};
        int[] arr = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().toArray();
        Arrays.stream(arr).forEach(v -> System.out.println(v));
    }
}
