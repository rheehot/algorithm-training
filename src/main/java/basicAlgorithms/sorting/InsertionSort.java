package basicAlgorithms.sorting;

/**
 * Created by kimchanjung on 2020-02-14 3:32 오후
 * 삽입정렬
 * 시간복잡도 - O(n²)
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
