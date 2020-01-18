package main.java.programmers.codingTestKit.bruteForce;

/**
 * Created by kimchanjung on 2020-01-17 12:59 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 * 코딩테스트 연습
 * 완전탐색
 * 카펫
 * 0 = brown, 1 = red
 * 000
 * 010
 * 000
 *
 * 3 * 3 = 9
 * 전체 개수는 = 레드 가로 + 2 * 레드 세로 + 2 = 전체가로 - 2 * 전체세로 - 2 임으로
 *
 * 전체가로 - 2 * 전체세로 - 2 = 레드개수 와 같으면
 *
 * 전체가로, 전체세로 값이 정답
 *
 */
public class Lessons42842 {
    public static int[] solution(int brown, int red) {
        int squareSize = brown + red;
        int sqrt = (int) Math.sqrt(squareSize);

        for (int i = sqrt; i < squareSize; i++) {
            if (squareSize % i != 0) continue;
            int width = squareSize / i;
            if ((width - 2) * (i - 2) == red) {
               return new int[]{Math.max(width, i), Math.min(width, i)};
            }
        }

        return null;
    }
}
