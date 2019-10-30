package test.java.functions;

import org.junit.Test;

import java.util.HashSet;
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
}
