package main.java.hackerrank.algorithms;

import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies
 *
 * 시작일, 종료일이 주어진다
 * 10, 14
 * 10 , 11, 12, 13, 14 일이 되고
 * 각 날짜 - 뒤집은 날짜, 10 - 01, 11 - 11, 12 - 21 이렇게 되고
 * 각 계산의 절대값에 / 주어진 k값을 나눈 후 소수가 아닌 정수로 딱 떨어지는 값이 몇개이냐 찾는다.
 */
public class BeautifulDaysAtTheMovies {

    public static int beautifulDays(int i, int j, int k) {

        return (int) IntStream.range(i, j+1)
                .filter(v -> (Math.abs(v - Integer.parseInt(new StringBuilder(String.valueOf(v)).reverse().toString())) / (double) k) % 1 == 0)
                .count();
    }

}
