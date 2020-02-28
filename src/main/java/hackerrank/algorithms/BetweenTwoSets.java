package hackerrank.algorithms;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 * [Beautiful Days at the Movies]
 * [EASY]
 *
 * #### a의 최대 공배수의 배수가 b의 약수인 수가 몇개 인지를 구하는 것 ####
 *
 *
 * 당신에게 두개의 정수 배열이 주어지며, 두가지 조건에 따라 만족하는 모든 정수를 결정하도록 요청됩니다.
 * <p>
 * 1. 첫번째 배열의 요소는 고려(정답인 수는)되는 정수의 모든 인수(곱하는 수) 입니다.
 *    - 즉 답을 구해야하는 수는 첫번째 배열의 수를 곱해 나온 값이라는 말이다
 *    - ex) 3 X 7 = 21 라면 21의 인수는 3, 7이며 또한 3 과 7은 21을 나눠 덜어지는 수여야 합니다.
 *
 * 2. 고려되는 정수는 두번째 배열의 모든 요소의 인수입니다.
 *    - 즉 답을 구해야하는 수는 두번째 배열의 모든 요소의 인수가 된다
 *    - 고려되는 값을 곱해서 나온 수들이 두번째 배열의 모든 요소들이라는 의미
 *
 * 종합적으로 정답이 되는 수는 a 배열을 인수(곱하는 값)로 가지는 값이며 이값은 배열 b의 인수 이기도 하다
 *
 *
 * <p>
 * 즉  두번째 배열의 모든 요소는 고려되는 정수 이며, 고려되는 정수의 모든 요소는 첫번째 배열이다.
 * <p>
 * 이 숫자는 두 배열 사이에 있다고 합니다(언급되고 있다. refer to), 당신은 그러한 숫자가 몇개가 존재하는지 결정해야합니다.
 * <p>
 * 예를 들면, 주어진 배열 a = [2, 6] 그리고 b = [24, 36], 그들 사이에 6과 12 두개의 숫자가 있습니다.(정답 숫자가 6, 12 두개 있다는 말)
 * 첫번째 값의 경우 6 % 2 = 0,  6 % 6 = 0, 24 % 6 = 0,  36 % 6 = 0,
 * 비슷하게      12 % 2 = 0, 12 % 6 = 0, 24 % 12 = 0, 36 % 12 = 0
 * <p>
 * 24, 36 > (6, 12) >  2, 6
 * <p>
 * 기능 설명
 * 세트 사이의 정수를 반
 * <p>
 * 입력형식
 * 첫번째 라인은 공백으로 구분된 배열 a의 요소수와 배열 b의 요소수 n 과 m 을 담고 있다.
 * 두번째 라인은 a[i]를 나타내는 공백으로 구분된 중복제거된 n 개의 정수를 담고 있다.
 * 세번째 라인은 b[i]를 나타내는 공백으로 구분된 중복제거된 n 개의 정수를 담고 있다.
 * <p>
 * 출력형식
 * <p>
 * a와 b 사이의 고려된 정수의 개수를 표시
 * <p>
 * 설명
 * 2와 4는 4, 8, 12, 16으로 균등하게 나뉩니다.
 * 4, 8 및 16은 16, 32, 96으로 균등하게 나뉩니다.
 * 4, 8 및 16은 a의 각 요소가 하나의 인자이고 각각이 b의 모든 요소의 인자 인 유일한 3 개의 숫자입니다.
 */
public class BetweenTwoSets {

    /**
     * 두수의 최대 공약수 계산식
     * 두수중에서 큰수에 작은 수를 나눈 나머지가 최대 공약수 이다
     * 46 / 10 = 몫은 4 나머지 6 -> 0이 아니므로 0 이 될때 까지
     * 10 / 6  = 몫은 1 나머지 4
     * 6 / 4   = 몫은 1 나머지 2
     * 4 / 2   = 몫은 2 나머지 0 -> 끝
     *
     * @param number1
     * @param number2
     * @return
     */

    public static int getGCD(int number1, int number2) {
        // a를 b로 나눠서 나머지가 0일 때 까지 나눈다.
        while (number2 > 0) {
            int remainder = number1 % number2;
            number1 = number2; // 나누는 수(b) 에 다시 나머지(a%b)를 나누기 위해 나누는 수(b)를 나눠지는 수(a)에 할당
            number2 = remainder; // 나누는 수(b)에  a % b의 나머지로 로 나누기 위해 b에 할당
        }

        return number1;
    }

    /**
     * 최소 공배수는 두수를 곱한 수에 공약수를 나눈수
     * @param number1
     * @param number2
     * @return
     */
    public static int getLCM(int number1, int number2) {
        return number1 * number2 / getGCD(number1, number2);
    }



    /**
     *  a의 최대공약수의 배수가 b의 약수인 수가 몇개 인지를 구하는 것
     *  a의 최대공약수와 b의 최소공배수 사이에서 a의 최대공약수의 배수가 b의 최소공배수에 나눠 떨어지는 수가 몇개인지를 구한다
     * @param a
     * @param b
     * @return
     */
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int gcd = 0;
        int lcm = 1;
        int lcmMultiple;
        int totalX = 0;

        // a의 최소공배수를 구한다.
        for (int element : a) {
            lcm = getLCM(lcm, element);
        }

        // b의 최대공약수를 구한다.
        for (int element : b) {
            gcd = getGCD(gcd, element);
        }

        // a의 최소 공배수의 배수를 b의 최대공약수에 나눠 떨어지는 수는 B의 약수가 된다.
        for (int i = 1; i <= gcd; i++) {
            lcmMultiple = lcm * i;

            if (gcd % lcmMultiple == 0) totalX++;
        }

        return totalX;

    }
}
