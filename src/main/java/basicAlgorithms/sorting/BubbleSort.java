package basicAlgorithms.sorting;

/**
 * Created by kimchanjung on 2020-02-14 3:21 오후
 * https://www.baeldung.com/java-selection-sort
 * 버들 정렬
 * 시간 복잡도 - O(n²)
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        final int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (j + 1 < length && arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}
