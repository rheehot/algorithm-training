package programmers.codingTestKit.hash;

import java.util.Arrays;
import java.util.HashMap;

public class Lessons42578 {
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        Arrays.stream(clothes)
                .forEach(v ->  map.merge(v[1], 1, (o, d) -> o + 1));

        return map.values()
                .stream()
                .reduce(1, (p, n) -> p * (n + 1)) - 1;
    }
}
