package basicAlgorithms;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by kimchanjung on 2020-02-18 2:09 오후
 */
public class ManacherAlgorithm {
    public static void manacherAlgorithm(String s) {
        /**
         * 짝수 글자의 경우는 이 각문자 사이에 더미 문자를 넣어주어 알고리즘이 동작한다.
         * 즉 문제에서 문자열이 홀수라는 조건이 없다면 필수로 더미 문자를 넣어주어야 한다,
         */
        s = "#" + s.chars()
                .mapToObj(v -> Character.toString((char) v))
                .collect(Collectors.joining("#")) + "#";

        int right = 0; // 회문이 되는 문자열의 오른쪽 범위의 index
        int center = 0; // 회문이 되는 문자열의 중심이 되는 index
        int[] radius = new int[s.length()];
        // 회문문자를 잘라내기 위해서 추가된 부분
        int maxRadius = 0, radiusIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            // 현재 문자열의 범위가 현재까지 회문의 오른쪽 범위에 포함이 된다면
            if (i <= right) radius[i] = Math.min(radius[2 * center - i], right - i);

            // 현재 문자열의 회문이 되는 왼쪽 끝 다음이 문자열의 시작을 벗어나지 않고 (즉 문자열 시작범위)
            // 현재 문자열의 회문이 되는 오늘쪽 끝 다음이 문자열의 끝을 벗어나지 않고 (즉 문자열의 끝 범위)
            // 현재 문자열의 회문이 되는 왼쪽 다음 문자열과 오늘쪽 다음 문자열이 같으면 회문이 되는 것임
            // 회문이 되는 길이가 늘어 났으므로 회문이 되는 범위의 반지름을 증가 시켜준다
            while (i - radius[i] - 1 >= 0
                    && i + radius[i] + 1 < s.length()
                    && s.charAt(i - radius[i] - 1) == s.charAt(i + radius[i] + 1))
                radius[i]++;

            // 현재 까지 최대 회문이 되는 오른족 범위 보다 현재문짜의 오른쪽 회문이 더 길다면
            // 현재 까지 최대 회문 오른쪽 길이와 중심을 갱신한다.
            if (right < i + radius[i]) {
                right = i + radius[i];
                center = i;
            }

            // 회문문자를 잘라내기 위해서 추가된 부분
            if (maxRadius < radius[i]) {
                maxRadius = radius[i];
                radiusIndex = i;
            }
        }

        System.out.println("sss = "+ s.substring(radiusIndex - radius[radiusIndex], radiusIndex + radius[radiusIndex]+1));
    }
}
