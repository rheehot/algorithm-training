package main.java.programmers.codingTestKit.bruteForce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-16 3:37 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42841
 * 코딩테스트 연습
 * 완전탐색
 * 숫자 야구
 * 좀 너저분한 문제인 듯
 *
 * 해결책은
 * 3자리 경우의 수를 가지고 조건을 비교하는 것
 *
 * 123 ... 987 까지 0이 포함되지 않고 112 처럼 죽복이 없는 숫자 리스트를 만든다.
 * 만들어진 숫자 리스트를 전체 순회 하면서 baseball 조건에 맞는 숫자인지 확인 한다.
 *
 */
public class Lessons42841 {

    public static int solution(int[][] baseball) {
        int answer = 0;
        List<String> candidateNums = createData();

        for (String candidateNum : candidateNums) {
            for (int j = 0; j < baseball.length; j++) {

                String num = String.valueOf(baseball[j][0]);
                int strikeNum = baseball[j][1];
                int ballNum = baseball[j][2];

                if (IntStream.range(0, 3).map(v -> candidateNum.charAt(v) == num.charAt(v) ? 1 : 0).sum() != strikeNum)
                    break;


                if (IntStream.range(0, 3)
                        .map(v -> IntStream.range(0, 3)
                                .anyMatch(k -> v != k && candidateNum.charAt(v) == num.charAt(k)) ? 1 : 0).sum() != ballNum)
                    break;

                if (baseball.length - 1 == j) answer++;

            }
        }

        return answer;
    }

    private static List<String> createData() {
        List<String> candidateNum = new ArrayList<>();

        for (int i = 123; i < 988; i++) {
            String s = String.valueOf(i);
            if (s.contains("0")) continue;

            if (s.charAt(0) == s.charAt(1)) continue;
            if (s.charAt(1) == s.charAt(2)) continue;
            if (s.charAt(0) == s.charAt(2)) continue;

            candidateNum.add(s);
        }

        return candidateNum;
    }
}
