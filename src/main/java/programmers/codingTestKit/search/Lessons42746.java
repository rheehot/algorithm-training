package main.java.programmers.codingTestKit.search;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by kimchanjung on 2020-01-13 3:15 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 * 코딩테스트 연습
 * 정렬
 * 가장 큰 수

 */
public class Lessons42746 {
    public static String solution(int[] numbers) {
        String str = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted(((o1, o2) -> (o2 + o1).compareTo(o1 + o2)))
                .collect(Collectors.joining());
        return str.substring(0, 1).equals("0") ? "0" : str;
    }
}
