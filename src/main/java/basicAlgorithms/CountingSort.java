package basicAlgorithms;

import java.util.Arrays;

public class CountingSort {

    public static int[] sort(int[] input) {
        int max = Arrays.stream(input).max().getAsInt();
        int[] aux = new int[input.length];
        int[] frequencyCount = new int[max + 1];
        Arrays.fill(frequencyCount, 0);

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
