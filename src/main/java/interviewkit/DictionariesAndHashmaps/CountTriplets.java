package main.java.interviewkit.DictionariesAndHashmaps;

import com.sun.codemodel.internal.JForEach;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/count-triplets-1
 * 주어진 배열 1 2 2 4 에서 x2가 주어지고 x2인 등비 수열 3개 조합 케이스가 몇개인지 찾는다
 *
 * 1 2 4 (0, 1, 3)
 * 1 2 4 (0, 2, 3) 이렇게 두개 나옴
 *
 * 알고리즘이 너무 햇갈린다.
 * 구글 시트 참고
 * https://docs.google.com/spreadsheets/d/16MjHV7O-lrtgcTHwVzazbma4fDWPSjzXEl3j3DLcTFg/edit#gid=0
 *
 */
public class CountTriplets {
    public static long countTriplets(List<Long> arr, long r) {

        Map<Long, Long> start = new HashMap<>();
        Map<Long, Long> mid = new HashMap<>();
        long sum = 0;

        for (Long v : arr) {
            if (v % r == 0) {
                 sum += mid.getOrDefault(v/r, 0L);
                 mid.put(v, mid.getOrDefault(v, 0L) + start.getOrDefault(v/r, 0L));
                 System.out.println(v+") "+v/r+" start = "+start.getOrDefault(v/r, 0L)+", "+v+" middle = "+mid.getOrDefault(v, 0L));
            }

            start.put(v, start.getOrDefault(v , 0L) + 1);
        }

        System.out.println("sum = "+sum);

        return sum;
    }
}
