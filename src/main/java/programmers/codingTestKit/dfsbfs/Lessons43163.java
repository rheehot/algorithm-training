package main.java.programmers.codingTestKit.dfsbfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-10 3:12 오후
 * https://programmers.co.kr/learn/courses/30/lessons/43163
 */
public class Lessons43163 {

    public static int solution(String begin, String target, String[] words) {
        int count = 0;
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        if (!wordList.contains(target)) return 0;

        while (begin != target) {
            if (compare(begin, target)) {
                begin = target;
                count++;
                break;
            }
            for (String word : wordList) {
                if (compare(begin, word)) {
                    begin = word;
                    wordList.remove(word);
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    private static boolean compare(String begin, String target) {
        return IntStream.range(0, begin.length()).map(i -> begin.charAt(i) == target.charAt(i) ? 1 : 0).sum() >= begin.length() - 1;
    }
}
