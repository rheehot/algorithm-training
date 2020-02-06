package programmers.codingTestKit.search;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-13 2:44 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 * 코딩테스트 연습
 * 정렬
 * K번째수
 */
public class Lessons42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] ret = new int[commands.length];

        for (int i = 0; i < commands.length ; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            ret[i] = arr[commands[i][2]-1];
        }

        return ret;
    }
}
