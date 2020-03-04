package hackerrank.interviewkit.DictionariesAndHashmaps;

import com.sun.codemodel.internal.JForEach;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/count-triplets-1
 * [Count Triplets]
 * [MEDIUM]
 *
 * 주어진 배열 [1 2 2 4] 에서 배수가 2가 주어 진다면
 * 각 수에 2를 곱해서 떨어지는 3개의 수가 중복없이 몇개가 나오는지 찾는 문
 * [1, 2, 2, 4]
 *  1  2     4
 *  1     2  4
 * 2개가 나온다 1 ,2 ,2  2가 중복이므로 제외
 * 알고리즘이 너무 햇갈린다.
 * 구글 시트 참조
 * https://docs.google.com/spreadsheets/d/16MjHV7O-lrtgcTHwVzazbma4fDWPSjzXEl3j3DLcTFg/edit#gid=0
 */
public class CountTriplets {
    public static long countTriplets(List<Long> arr, long r) {

        Map<Long, Long> start = new HashMap<>();
        Map<Long, Long> mid = new HashMap<>();
        long sum = 0;

        for (Long v : arr) {
            if (v % r == 0) {
                sum += mid.getOrDefault(v / r, 0L);
                mid.put(v, mid.getOrDefault(v, 0L) + start.getOrDefault(v/r, 0L));
                System.out.println(v + ") " + v / r + " start = " + start.getOrDefault(v / r, 0L) + ", " + v + " middle = " + mid.getOrDefault(v, 0L));
            }

            start.put(v, start.getOrDefault(v, 0L) + 1);
        }

        System.out.println("sum = " + sum);

        return sum;
    }
}
