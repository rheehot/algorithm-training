package main.java.hackerrank.algorithms;

/**
 * 12시간 오전/오후 형식으로 시간이 주어졌다. 군사시간(24)으로 변환 하라
 * 주의: 자정 12:00:00 AM은 12시간제 이며, 00:00:00은 24시간제 이다. 정오 12:00:00PM 12시간제이며, 12:00:00은 24시간제이다.
 *
 * 기능설명
 * 입력시간을 24시간제로 나타내는 새로은 문자형을 반환해야한다.
 * 시간변환 함수는 다음과 같은 매개변수를 가진다
 *  - 12시간제를 나타내는 문자
 *
 * 입력 형식
 *  - 하나의 문자 s는 12시간제 형식을 시간을 담고 있다.
 *
 * 출력 형식
 *  - 주어진 시간을 24시간제로 변환하고 표시하라.
 */
public class TimeConversion {
    public static String timeConversion(String s) {

        int hh = Integer.parseInt(s.substring(0, 2)) % 12;

        if (s.contains("PM")) hh += 12;

        return String.format("%02d%s", hh, s.substring(2, 8));
    }
}
