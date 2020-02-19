package smallFunctions;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest {
    @Test
    public void STRING을_CHAR_루프_처리() {
        String str = "abcde";
        int[] arr = new int[26];
        str.chars().forEach(v -> arr[v - 'a']++);
    }


    @Test
    public void STRING을_구분자_넣어서_재조합() {
        String str = "abcde";
        String collect = str.chars()
                .mapToObj(v -> Character.toString((char) v))
                .collect(Collectors.joining(","));
        System.out.println(collect);

    }
}
