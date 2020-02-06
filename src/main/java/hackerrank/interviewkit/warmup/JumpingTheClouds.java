package hackerrank.interviewkit.warmup;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 *
 * 0 0 1 0 0 1 0
 *
 * 1칸 또는 2칸 점프 가능
 * 단 1을 피해 가야함
 * 0 -> 두칸 점프 1로 갈 수 있지만 1이라서 안됨 0 0 0 인경우 두칸 점프 해서 0 -> 0 으로 가능
 *
 * 이런 룰을 적용해서 최소 경로 횟수 구하기
 *
 */
public class JumpingTheClouds {
    public static int jumpingOnClouds(int[] c) {
        int count = -1;

        for (int i = 0; i < c.length;) {
            if (i+2 < c.length && c[i + 2] == 0) {
                i = i + 2;
            } else {
                i = i + 1;
            }
            count++;
        }

        return count;
    }
}
