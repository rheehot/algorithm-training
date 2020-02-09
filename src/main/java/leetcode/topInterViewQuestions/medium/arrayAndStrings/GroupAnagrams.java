package leetcode.topInterViewQuestions.medium.arrayAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by kimchanjung on 2020-02-09 6:38 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/778/
 * [Group Anagrams]
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            map.merge(Stream.of(str.split("")).sorted()
                            .collect(Collectors.joining()),
                    new ArrayList(Arrays.asList(str)), (o, n) -> {
                        o.add(str);
                        return o;
                    });
        }

        return new ArrayList(map.values());
    }
}
