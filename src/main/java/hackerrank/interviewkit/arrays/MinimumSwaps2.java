package main.java.hackerrank.interviewkit.arrays;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/minimum-swaps-2
 *
 * 이문제는 LIS 알고리즘이 아니다 햇갈림 주의
 *
 * 중복된 숫자가 없고 정렬되지 않은 임의의 숫자를 정렬시키는데 최소 횟수를 구하는 문제
 *
 * 4 3 1 2
 *
 * 해결책
 *
 * 어렵게 정렬알고리즘을 구하는 것이아니라
 *
 * 1. 배열의 원소 숫자가 자기 자리면 즉 숫자가 3 이고 배열에서 자기 순서 있으면 다음 배열로 이 동
 *    (배열이 0부터 시작 하기 때문에 index + 1 값과 숫자가 같으면 자기자리에 있는것)
 *
 * 2. 배열의 숫자가 4 인데 자기 자리가 아니므로 자기자리로 이동 시키고 그자리에 있던 숫자를 4가 있던 자리와 맞받군다.
 *    4 3 1 2
 *    2 3 1 4 => 4와 2를 서로 이동
 *    3 2 1 4 => 3과 1을 서로 이동
 *    1 2 3 4 => 1은 자기 자리, 2도 자기자리 ~ 4까지 자기 자리
 *    총 3번 이동 하여 정렬 완료
 */
public class MinimumSwaps2 {
    public static int minimumSwaps(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length;) {
            if (arr[i] == i + 1){
                i++; // 숫자가 자기 자리에 있으면 다음으로 진행한다.
            } else {
                int temp = arr[i]; // 숫자를 일단 temp에 저장자
                // 숫자를 자기자리에 있는 숫자와 맞받구기위한 처리
                // 3 2 1 => 1 2 3 ( 1과 3을 맞받군다)
                arr[i] = arr[temp - 1];  // 숫자를 자기자리로 이동시키기 위해서 그자리에 있는 숫자를 숫자의 지금 자리로 이동
                arr[temp - 1] = temp; // 숫자는 자기 자리로 이동
                count++;
                System.out.println(count);
            }

        }

        return count;
    }

}
