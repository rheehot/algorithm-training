package programmers.codingTestKit.bruteForce;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-14 5:06 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42839
 * 코딩테스트 연습
 * 완전탐색
 * 소수 찾기
 *
 * 쉽지 않은 문제 였다
 * 일단 순열을 찾아내는 알고리즘을 사용하여 해결한다.
 *
 * 1,2,3
 *
 * 일단은 nPr => n개 중에서 r개의 구성으로 나오는 순열을 구하는데
 *
 * 총 3개 중 3 개를 가지고 구하는 순열 말고도
 * 1,2,3
 * 1,3,2
 * 2,1,3
 * 2,3,1
 * ....
 *
 * 3 개중 1 개
 * 1
 * 2
 * 3
 *
 * 3 개중 2 개 까지의 순열도 구해야한다
 * 1,2
 * 2,1
 * 3,2
 * ...
 *
 * 이렇게 구한 숫자의 순열을 합쳐서 소수인지 판별하면 된다.
 *
 * 알고리즘은 순열 알고리즘을 사용하고
 * 발생된 순열의 중복제거를 위해서 set에 저장하는데 그이유는
 * 1,2,3 <= 이렇게 중복없는 숫자가 입력값이 아니라
 * 1,1,2 <= 중복된 숫자가 있을 수 있다, 자리가 다르기 때문에
 * 1,2,1  /  1,1,2 /  2,1,1 <= 이렇게 구성 될 수 있으나
 * 1,1 / 1,1 <= 이런 케이스가 발생하기 때문에 중복을 제거하는 것임
 *
 * 중복제거된 순열에서 소수인지 판별하여 카운트 한 값을 리턴한다.
 */
public class Lessons42839 {
    private static String[] nums;
    private static Set<Integer> set = new HashSet();

    public static int solution(String numbers) {
        nums = numbers.split("");
        IntStream.range(0, nums.length).forEach(i -> nPr(0, nums.length, i + 1));
        return (int) set.stream()
                .filter(v -> new BigInteger(String.valueOf(v)).isProbablePrime(5))
                .count();
    }

    private static void nPr(int pivot, int n, int r) {
        String permutation = String.join("", Arrays.copyOfRange(nums, 0, r));

        if (set.contains(permutation)) return;

        if (pivot == r) {
            set.add(Integer.parseInt(permutation));
        }

        for (int i = pivot; i < n; i++) {
            swap(i, pivot);
            nPr(pivot + 1, n, r);
            swap(i, pivot);
        }
    }

    private static void swap(int i, int j) {
        String temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
