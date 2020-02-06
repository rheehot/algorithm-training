package hackerrank.interviewkit.sorting;

import java.util.Arrays;

/**
 * level:hard
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/
 *
 * 2 3 4 2 3 6 8 4 5
 *
 * 은행에 각각 출금 데이터가 있다 2 3 4 2 3 6 8 4 5
 * 주어진 출금일 d 가 있고 d 만큼의 데이터의 중간값(median) x 2 값이 d 다음값 보다 같거나 작으면 통지를 보낸다
 * 통지 회수를 구한다
 *
 * 중앙값
 * 중앙값은 숫자를 내림 차순 정렬 후 숫자의 개수가 홀수면 중간 자리
 * 1 2 3 4 5 => 3
 * 짝수면
 * 1 2 3 4 => (2 + 3) / 2 =  2.5 가 된
 *
 * 예를 들어 d = 5 면
 * 1) 2 3 4 2 3 의 중앙값은 3*2 <= 6 알람 1
 * 2) 3 4 2 3 6 의 중앙값은 3*2 <= 8 알람 1
 * 3) 4 2 3 6 8 의 중앙값은 4*2 <= 4 아니므로 알람무
 * 4) 2 3 6 8 4 의 중앙값은 4*2 <= 5 아니므로 알람무
 * 총 2번이다
 *
 * 해결책
 * 우선 위에 각 4번의 숫자들을 내림차순 정렬을 하는데 매번 정렬 메소드를 사용하면 타임오버난다
 * 그래서 계수정렬을 사용하는데
 * 계수정렬은
 * 처음에 각 숫자를 배열의 index로 하고 숫자개수를 값으로 하는 배열을 만들고 다시 정렬하는데
 * 여기서는 숫자의 개수를 가진 배열만 일단 만든다 2 3 4 2 3 6 8 4 5 <= 전체를 숫자 빈도수 배열을 만드느게 아니라
 * 2 3 4 2 3 처음 5개를 빈도수 배열로 만들고 => 중앙값 구하고 => 알람유무 합산
 * 3 4 2 3 6 다음 5개의 빈도수 배열로 만들고 => 중앙값 구하고 => 알람유무 합산 ...
 * 한다.
 *
 *
 */
public class FraudulentActivityNotifications {

    static double getMedian(int[] arr, double d) {
        int seq = 0, medianA = 0, medianB = 0;
        double midSeq =  Math.ceil(d / 2);

        for (int i = 0; i < arr.length; i++) {
            seq += arr[i];

            if (d % 2 == 0) {
                // 짝수이므로 1 2 3 4 => 2, 3번째 수를 찾아서 더한후 / 2를 나눠서 리턴
                if (midSeq <= seq && medianA == 0) medianA = i;
                if (midSeq + 1 <= seq && medianB == 0) {
                    medianB = i;
                    break;
                }
            } else {
                // 5의 중간 번재는 3 이고 계수정렬에서 2(2), 3(3), 4(1) => 2 2 3 3 4 이므로
                // 숫자의 개수를 합산하면 2는 2개 3은 2개 2개+2개 하면 4번째 이고 3보다 작거나 같으니 3이 중간값은 3번째와 4번째에 존재하는 3을 찾는다.
                if (midSeq <= seq) return i;
            }
        }

        return (double) (medianA + medianB) / 2;
    }

    public static int activityNotifications(int[] expenditure, int d) {
        // 주어진 수열의 제일 큰 값을 미리 찾는다 계수정렬의 사이즈를 정하기 위
        int max = Arrays.stream(expenditure).max().getAsInt();
        int[] freq = new int[max + 1];
        int notification = 0;

        // 처음 d 만큼의 숫자만 빈도수 배열에 저장한
        for (int i = 0; i < d ; i++) {
            freq[expenditure[i]]++;
        }

        for (int i = d; i < expenditure.length  ; i++) {
            // 빈도수 배열을 가지고 중앙값을 구한다.
            double median = getMedian(freq, d);

            // 알람 유무 확인 후 합산
            if (expenditure[i] >= (median * 2)) notification++;

            /**
             * 아래는 빈도수배열에서 처음 값 2 3 4 2 3 에서 2를 빼는 행위다
             * 빈도수 배열은 처음에 0(0), 1(0), 2(2), 3(2), 4(1) 이렇게 들어가 있고 이걸 풀면 2 2 3 3 4 이렇게 정렬되는 형태로 중앙값 찾는다.
             * 아래처리를 하면 i-d = 0 이되고 expenditure[0] = 2 가 되고 freq[2]-- 하면
             * 처음  0(0), 1(0), 2(2), 3(2), 4(1)  =>  0(0), 1(0), 2(1), 3(2), 4(1)
             * i = 5, freq[5] = 6이므로
             *  => 0(0), 1(0), 2(1), 3(2), 4(1), 6(1)로 되고 풀면 2 3 3 4 6이 되는것이다
             *  즉 아래 처럼 숫자를 순자적으로 5개씩 끊어서 처리하는 것과 찬가지가 된다.
             * 1) 2 3 4 2 3
             * 2) 3 4 2 3 6
             * 3) 4 2 3 6 8
             * 4) 2 3 6 8 4
             *
             */
            freq[expenditure[i-d]]--;
            freq[expenditure[i]]++;
        }


        return notification;
    }
}
