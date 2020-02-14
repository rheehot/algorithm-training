package basicAlgorithms.sorting;

import java.util.Arrays;

/**
 * 계수정렬
 * 시간 복잡도 - O(n)
 * 원리
 * 비정렬된 배열
 * [2,1,1,2,3]
 *
 * 1. 각 숫자를 index로 하고 개수를 저장한다
 *    [1, 2, 3]
 *     2  2, 1
 *
 * 2. 그리고 각 index의 개수를 누적합으로 변경한다
 *    [1,      2,      3]
 *     2,      2,      1
 *     2(0+2), 4(2+2), 5(4+1)
 *
 * 3. 누적 합이 해당 숫자가 들어갈 정렬된 자리가 되는 것이다
 *    이제 원본 배열을 순회 하면서 숫자의 누적합 자리에서 하나씩 차감하여
 *    새로 정렬된 숫자가 들어가 배열에 숫자를 넣는다.
 *
 *    [0,     1,      2,      3]
 *     0,     2,      4,      5
 *
 *    index가 0부터 시작이니 감안해서 계산한다.
 *    0 => 0
 *    1 => 0,1 자리에 1 입력
 *    2 => 2,3 자리에 2 입력
 *    5 => 4 자리에 3 입력

 *
 */
public class CountingSort {

    public static int[] sort(int[] input) {
        int max = Arrays.stream(input).max().getAsInt();
        int[] aux = new int[input.length];
        int[] frequencyCount = new int[max + 1];

        // 각 원소 갯수 계산
        for (int i = 0; i < input.length; i++) {
            frequencyCount[input[i]] += 1;
        }

        // 누적합 계산
        for (int i = 1; i < frequencyCount.length; i++) {
            frequencyCount[i] += frequencyCount[i - 1];
        }

        // 누적합을 이용해 정렬
        for (int i = input.length - 1; i >= 0; i--) {
            aux[--frequencyCount[input[i]]] = input[i];
        }

        return aux;
    }
}
