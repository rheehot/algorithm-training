package basicAlgorithms.sorting;

/**
 * Created by kimchanjung on 2020-02-14 3:47 오후
 * Shell 정렬
 * 시간복잡도 - O(n²)
 */
public class SellSort {
    public static void sellSort(int arr[]) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }
    }
}
