package test.java.functions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class convertTypeTest {

    @Test
    public void STRING을_아스키로_변환_STRING으로_다시합치기() {
        String collect = "ABCD".chars().mapToObj(s -> String.valueOf(s)).collect(Collectors.joining());

        System.out.println(collect);
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
}
