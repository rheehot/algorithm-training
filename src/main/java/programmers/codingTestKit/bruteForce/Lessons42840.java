package programmers.codingTestKit.bruteForce;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-14 3:12 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 * 코딩테스트 연습
 * 완전탐색
 * 모의고사
 *
 * 지문이 햇갈릴 수 있음
 *
 * 1, 2, 3 학생의 각 획득한 점수 순서대로 학생 번호를 리턴하는 것이 아니라
 * 최고 점수를 받은 학생의 인덱스만 리턴 하는 것임
 * 즉 1 = 2개, 2 = 1개, 3 = 1개 => 1번 학 리턴
 *
 */
public class Lessons42840 {
    public static int[] solution(int[] answers) {
        int[] st1 = {1, 2, 3, 4, 5};
        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] st = new int[3];

        for (int i = 0; i < answers.length; i++) {
            st[0] = answers[i] == st1[i % 5] ? ++st[0] : st[0];
            st[1] = answers[i] == st2[i % 8] ? ++st[1] : st[1];
            st[2] = answers[i] == st3[i % 10] ? ++st[2] : st[2];
        }

        int max = Arrays.stream(st).max().getAsInt();

        return IntStream.range(0, st.length)
                .boxed()
                .filter(i -> st[i] == max)
                .mapToInt(i -> i + 1).toArray();
    }

}
