package main.java.programmers.codingTestKit.search;

import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-01-13 4:50 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42747
 *
 * 코딩테스트 연습
 * 정렬
 * H-Index
 * 도움말
 * 문제 설명이 어렵다
 * 원리는
 * [3, 0, 6, 1, 5]
 * [0, 1, 3, 5, 6] <= 오름 차순 정렬
 *  5  4  3  2  1  <= 인덱스를 거구로 한 갑과 비교(인덱스는 논문의 개수를 표현하는 것)
 *
 *  0 >= 5
 *  1 >= 4
 *  3 >= 3 => h-index => 3
 *
 *  3이상인 수 가 3,5,6 3개
 *  3이하인 수 가 3,1,0 3개
 *  정답은 3
 * [22, 42]
 *  2,  1
 *
 *  22 >= 2 => h-index => 2개
 *
 *  2이상인 수가 2개
 *  2이하인 수가 2개 이기도 함 (이하는 2도 포함 이기 때문에
 *  문제의 해설이 참 애매모함 ....
 *
 */
public class Lessons42747 {
    public static int solution(int[] citations) {
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            System.out.println((citations.length - i) + " = " + citations[i]);
            if (citations[i] >= citations.length - i) System.out.println(" == " + (citations.length - i));
        }

        return 0;
    }
}
