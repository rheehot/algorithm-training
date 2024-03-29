package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/
 * [Birthday Cake Candles]
 * [EASY]
 *
 * 당신의 조카 생일을 위한 케익을 담당하고 있으며 그녀의 총 나이의 매해 마다 하나의 촛불을 가질 것을 결정 하였습니다.
 * 그녀가 촛불을 불어서 끌때, 가장 긴 것 중 하나를 불어 끌 수도 있습니다. 당신의 임무는 그녀가 성공적으로 불어 끌수 있는 촛불의 개수를 찾는 것 입니다.
 * <p>
 * 예를 들면, 만약 당신의 초카가 4살이고, 높이가 4,4,1,3 인 4개의 초를 가진 케익 있다, 그녀는 2개의 촛불을 성공적으로 불어 끌 수 있을 것이다
 * 가장 높은 높이 4인 양초가 2개가 있기 때문이다.
 * <p>
 * 기능설명
 * 그녀가 끌수 있는 촛불의 개수를 나타내는 정수를 반환 해야합니다.
 * <p>
 * 입력형식
 * - 첫번째 라인은 케익의 촛불 개수를 나타내는 하나의 정수형 n 을 포함
 * - 두번째 라인은 공백으로 구분된 숫자를 포함하며, 여기서 각 정수 i는 촛불의 높이 i를 설명한다.
 * <p>
 * 설명
 * 우리는 높이 1인 1개 촛불, 높이 2인 1개 촛불, 높이 3인 두개의 촛불을 가진다. 당신의 조카는 오직 가장 높 촛불을 불어 끈다, 높이 3을 의미하는 양초,
 * 그런 양초가 2개 있기 때문에, 우리는 새라인에 2를 표시 합니다.
 **/
public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(int[] ar) {
        int result = 0, tallest = 0;

        for (int s : ar) {
            if (tallest < s) {
                tallest = s;
                result = 1;
            } else if (tallest == s) {
                result++;
            }
        }

        return result;
    }
}
