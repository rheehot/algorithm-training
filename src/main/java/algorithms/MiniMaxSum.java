package main.java.algorithms;

import java.util.Arrays;

/**
 * 5개의 양의 정수가 주어 집니다, 5개의 정수 중 정확히 4개를 합산 하여 계산할 수 있는 최소값과 최대값을 찾는다.
 * 공백으로 분리된 두개의 long integer로 하나의 라인에 각각 최소값과 최대값을 표시합니다.
 * 예를들어 arr = [1, 3, 5, 7, 9]. 최소값의 합은 1 + 3 + 5 + 7 = 16 그리고 최대값의 합은 3 + 5 + 7 + 9 = 24.
 * 인쇄 할 것 입니다.
 * 16 24
 *
 * 기능설명
 * miniMaxSum function 을 아래 애디터에서 완성 하세요. 5개 요소 중 4개의 최소값 합과 최대값 합을 하나의 라인데 공백으로 분리된 숫자형으로 표시 해야합니다.
 * miniMaxSum은 다음 매개 변수를 가집니다.
 * - arr: an array of  integers
 *
 * 입력 형식
 * 하나의 라인에 공백으로 분리된 숫자
 *
 * 출력 형식
 * 5개의 숫자 중 4개의 정확한 합산으로 계산되어 값은 각각 최대값과 최소값을 나타내며 공백구분으로 두개의 숫자로 표시합니다.
 *
 */
public class MiniMaxSum {
    public static void miniMaxSum(int[] arr) {

        long maximum = 0, minimum = 1000000000, sum = 0;

        for (int el : arr) {
            sum += el;
            if (minimum > el) minimum = el;
            if (maximum < el) maximum = el;
        }

        System.out.println((sum - maximum) + " " + (sum - minimum));
    }

}
