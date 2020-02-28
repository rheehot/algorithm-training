package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/staircase/problem?h_r=internal-search
 * [Staircase]
 * [EASY]
 *
 * n = 4인 계단의 크기를 고려하세요.
 * 밑변과 높이가 둘다 n과 같은지 확인 하세요, 그리고 이미지는 # 심볼과 공백을 이용하여 그립니다. 마지막 라인 앞에는 공백이 없습니다.
 * n 사이즈 계단을 나타내는 프로그램을 작성하세요.
 *
 * 기능설명
 * 계단 기능을 아래 에디터에서 완성하세요. 위에 설명된 것 처럼 계단을 표시 해야 합니다.
 * 계단은 다음과 같은 매개변수를 가지고 있습니다.
 * - n: an integer
 *
 * 입력형식
 * 계단의 크기를 나타내는 단일 Integer n
 *
 * 제약
 * n은 0초과 100이하
 *
 * 출력형식
 * # 심볼과 공백을 사용하여 n 크기의 계단을 표시하세요.
 *
 * 주의
 * 마지막 라인은 반드시 0 개의 공백을 가져야 합니다.
 *
 * 입력 예제
 * 6
 *
 * 출력 예제
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 *
 * 설명
 * 계단은 우측 정렬, # 심볼과 공백으로 구성, n = 6 인 높이와 넓이를 가집니다.
 *
 */
public class Staircase {
    public static void staircase(int n) {

        String left, right;

        for (int i = 0; i < n; i++) {
            left =  "%"+(n - i)+"s";
            right = n - (n - i) == 0 ? "" : "%0" + (n - (n - i)) + "d";

            System.out.println(String.format(left+right, "#",0).replaceAll("0", "#"));
        }
    }
}
