package test.java.smallFunctions;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ConvertTypeTest {

    @Test
    public void STRING을_아스키로_변환_STRING으로_다시합치기() {
        String collect = "ABCD".chars().mapToObj(s -> String.valueOf(s)).collect(Collectors.joining());

        System.out.println(collect);
    }

    @Test
    public void 문자배열을_숫자로_변경() {
        String s = "1 2 3 4 5";
        int[] s1 = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int a : s1) {
            System.out.println(a);
        }
    }

    /**
     * https://www.baeldung.com/convert-array-to-set-and-set-to-array
     */
    @Test
    public void 배열을_HASHSET으로_변경() {
        int[] arr = {1, 2, 3, 3, 4};

        HashSet<Integer> hashset = IntStream.of(arr).boxed()
                .collect(Collectors.toCollection(HashSet::new));

        hashset.stream().forEach(s -> System.out.println(s));
    }

    /**
     * https://www.baeldung.com/java-sort-string-alphabetically
     */
    @Test
    public void 문자열_SORTING() {
        String str = "dcba";
        String reversedStr = str.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println(reversedStr);

        String reversedStr2 = Stream.of(str.split("")).sorted().collect(Collectors.joining());
        System.out.println(reversedStr2);
    }

    @Test
    public void 리스트를_한라인에_초기화_생성() {
        List<Integer> inputs = Arrays.asList(1, 3, 9, 9, 27, 81);

        inputs.forEach(v -> System.out.println(v));
    }

    @Test
    public void 리스트를_한라인에_초기화_생성_Long() {
        List<Long> inputs = new ArrayList<>(Arrays.asList(1L, 3L, 9L, 9L, 27L, 81L));

        inputs.forEach(v -> System.out.println(v));
    }

    /**
     *  https://www.baeldung.com/java-stream-sum
     */
    @Test
    public void 배열의_요소를_SUM() {
        List<Integer> inputs = Arrays.asList(1, 3, 9, 9, 27, 81);
        int sum = inputs.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }


    @Test
    public void int배열을_Integer큐로_변환() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Queue<Integer> queue = new LinkedList(IntStream.of(arr).boxed().collect(Collectors.toList()));

        queue.forEach(v -> System.out.println(v));
    }

    @Test
    public void LIST를_배열로_변환() {
        List<Integer> inputs = Arrays.asList(1, 3, 9, 9, 27, 81);
        int[] ints = inputs.stream().mapToInt(Integer::intValue).toArray();
        Arrays.stream(ints).forEach(v -> System.out.println(v));
    }

    @Test
    public void CHAR숫자를_숫자로_변환() {
        char i = '1';
        System.out.println(i - '0');
        System.out.println(Character.getNumericValue(i));

    }

    @Test
    public void 배열을_MAP으로_변환() {
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        Map<String, Boolean> map = Arrays.stream(words).collect(Collectors.toMap(v -> v, v -> false));
        map.forEach((k,v) -> System.out.println(k+", "+v));
    }

    @Test
    public void STRING_배열을_STRING으로_합치기() {
        String[] split = "123456".split("");
        System.out.println(String.join("", split));
    }
}
