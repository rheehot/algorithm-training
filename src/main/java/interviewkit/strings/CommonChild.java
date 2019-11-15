package main.java.interviewkit.strings;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/common-child
 * LCS 알고리즘을 사용하면된다
 * 문제 지문이 아주 햇갈린다.
 * 두 문자열에서 공통으로 포함된 문자열은 일단 아니고
 * 두문자열에서 공통으로 포함된 문자열 중에서 가장 긴 문자열의 개수를 찾는 것인데
 * 이것이 순서가 상관있는지 없는지 아니면 연결이 되어야 하는지 아닌지가 문제 예제에서 파악이 애매하다
 * 그러나 일단 기본적인 LCS 알고리즘을 사용하면 정답이다
 *
 * 1. 2차원 배열에서 행열은 첫째열은 전부 0으로 채운다
 *
 *     H A R R Y
 *   0 0 0 0 0 0
 * S 0 0 0 0 0 0
 * A 0 0 1 1 1 1
 * L 0 0 1 1 1 1
 * L 0 0 1 1 1 1
 * Y 0 0 1 1 1 2
 *
 * 2. 첫번째 행열은 전부 0으로 채웠으니 루프의 시작은 1부터, 두문자를 index순서대로 같이 비교한다(H == S), (A == A)
 * 3. 같으면 대각선값 즉 이전열, 이전행 의 값에 1을 더한다 index가 1,1 => 0,0의 값에 1더한다.
 * 4. 다르면 이전열값 [0,1], 이전행 값[1,0] 둘중 큰 값을 저장한다.
 * 5. 배열의 맨 끝값을 리턴한다. 문자 1,2 5개면 인덱스는 5,5가 된다, 이유는 첫번째 행열을 0으로 채우기 때문에
 *    5개 짜리면 사실 6,6개 짜리 2차원 배열이고 6,6 마지막 값은  인덱스로 보면 5,5 자리의 값이다.
 */
public class CommonChild {
    public static int commonChild(String s1, String s2) {
        int[][] arr = new int [s1.length()+1][s2.length()+1];

        for (int i = 1; i <= s1.length() ; i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            }
        }

//        System.out.print("    ");
//        s1.chars().forEach(v -> System.out.print((char) v+" "));
//        System.out.println();
//
//        for (int i = 0; i <= s1.length(); i++) {
//              System.out.print(i > 0 ? s2.charAt(i-1) + " " : "  ");
//
//            for (int j = 0; j <= s2.length() ; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        return arr[s1.length()][s2.length()];

    }
}
