package main.java.hackerrank.algorithms;

/**
 * 율리우스력, 그레고리력에서 각각 윤년을 계산한다
 * 율리우스력에서 윤년은 4로 나눠 떨어지면 윤연
 * 그레고리력에서 윤연은 4로 나워 떨어지지만 100으로 나눠 떨어지지않은 년 또는 400으로 나눠 떨어지는 년
 *
 * 그리고 문제에서 러시아는 1918년도 부터 그레고리력을 적용 하였다
 *
 * 그리고 프로그래머의 날은 256일 인데 8개월 이 윤년이면 244이고 아니면 243이다
 *
 * 256 -  윤년의 8개월치 날짜를 뺀 값이 9월 날짜가 된다
 *
 */
public class DayOfTheProgramer {
    public static String dayOfProgrammer(int year) {
        int dayOfTheProgrammer = 256;
        int day = 0;

        if (year == 1918) {
            day = 26;
        } else if (year < 1918 && year % 4 == 0) {
            day = dayOfTheProgrammer - 244;
        } else if ( year > 1918 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            day = dayOfTheProgrammer - 244;
        } else {
            day = dayOfTheProgrammer - 243;
        }

        return String.format("%d.%s.%d", day,"09", year);

    }
}
