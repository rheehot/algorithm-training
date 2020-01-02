package main.java.hackerrank.interviewkit.arrays;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos
 * 1 2 3 4 5
 * 2 1 5 3 4
 *
 * 5는 2번 이동
 * 2는 1번 이동 총 3번 이동이다
 *
 * 2 5 1 3 4
 * 5 가 3번 이동이다 그러면 Too chaotic 출력한다.
 * 즉 1나의 숫자가 앞으로 3번 이동하면 Too chaotic
 *
 * 솔루션은 배열에서 마지막 부터 거꾸로 진
 *
 * 숫자가 index(ex 5, index 2)보다 크고 3 이동이므로 Too chaotic 출력후 종료
 *
 * 숫자가 index 보다 크고 3이하 이동이라면 숫자 - index를 계속 더한다.
 *
 * 숫자가 index 보다 작은경우 next 값에 숫자를 저장한다.
 *
 * 숫자가 index 보다 작고 next 값 보다 숫자가 크면 이동한 것으로 보고 count 1 더한다
 *
 *

 */
public class NewYearChaos {
    public static void minimumBribes(int[] q) {
        String result = "";
        int count = 0;
        int next = q.length;

        for (int i = q.length - 1; i >= 0 ; i--) {
            if (q[i] - i > 3) {
                result = "Too chaotic";
                break;
            }

            if (q[i] > i + 1) {
                count += q[i] - (i + 1);
            } else if (q[i] < next) {
                next = q[i];
            } else if (q[i] > next) {
                count++;
            }
        }

        System.out.println(result != "" ? result : count);
    }

}
