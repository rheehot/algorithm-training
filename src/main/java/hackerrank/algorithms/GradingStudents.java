package main.java.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 해커랜드 대학은 다음과 같은 채첨 정책이 있다.
 *  - 모든 학생은 0 부터 100 범위의 성적을 받는다.
 *  - 40 미만 성적은 낙제 등급이다.
 *
 * 샘은 대핵교수이며, 이 규칙에 따라 학생의 성적을 반올림한다.
 *  - 5의 다음 배와 성적의 차이가 3이하면, 5의 다음 배수로 반올림한다.
 *  - 38 이하 성적이라, 결과는 여전히 낙제성적이므로 반올림이 발생하지 않는다.
 *
 * 예를 들면, 성적 = 84는 85로 반올림 될 것이지만, 성적 = 29는 반올림하면 40미만의 숫자가 되기 때문에 반올림하지 않습니다.
 * 샘의 n명 학생 각각의 초기 점수가 주어 집니다. 자동으로 반올림을 처리하는 코드를 작성하세요.
 *
 * 기능설명
 * 반올림된 성적을 담고 있는 정수형 배열을 반환 해야 합니다.
 * 매개변수 - 반올림 되기전 점수를 나타내는 정수형 배열.
 *
 * 입력형식
 * - 첫번째 라인은 학생수
 * - n이후 각 i라인 하나의 정수를 담고 있다. grade[i]는 학생의 성적을 나타낸다.
 *
 * 출력형식
 * - grade[i] 를 새로운 라인에 반올림된 성적으로 표시하라.
 */
public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade: grades) {
            int mod = grade % 5;
            roundedGrades.add(mod > 2 && grade > 37 ? grade + (5 - mod) : grade);
        }

        return roundedGrades;
    }
}
