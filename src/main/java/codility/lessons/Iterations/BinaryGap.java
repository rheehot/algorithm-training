package codility.lessons.Iterations;

/**
 * Created by kimchanjung on 2020-03-04 7:23 오후
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 * [Binary Gap]
 * [EASY]
 *
 * 숫자를 이진수로 변경후 0이 연속되는 가장 큰 자리 수를 리턴
 * 1041 => 10000010001
 * 00000 , 000 중 0이 5개가 되는 부분이 가장 크므로 5를 리턴한다.
 */
public class BinaryGap {
    public static int solution(int N) {
        String s = Integer.toBinaryString(N);
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return max;
    }
}
