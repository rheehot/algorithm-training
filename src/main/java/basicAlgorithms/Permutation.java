package basicAlgorithms;

/**
 * Created by kimchanjung on 2020-01-14 6:48 오후
 * 순열
 * 1,2 중 1,2 / 2,1
 * 같은 집합이라도 순서가 다른 것을 별개로 봄
 *           n!
 * nPr = ---------
 *        (n - r)!
 *
 * nPr =  n개 중 r개로 구성한 순열의 개수
 *
 * 1,2,3 중 n(3)개의 숫자중 r(3)개로 구성 하는 순열의 개수는
 *
 *              3 x 2 x 1 = 6
 * nPr(3P3) = -------------- =  6 개
 *              3 - 3  = 0
 *
 *
 * 1,2,3,4 중 n(4)개중 , r(2)개로 구성하는 순열의 개수는
 *
 *             4 x 3 x 2 x 1 (n!)    24
 * nPr(3P2) = ------------------- = ----   = 12 개
 *               2 x 1 (n-r)!        2
 */
public class Permutation {
    public static void perm(int[] arr, int pivot, int n, int r) {
        if (pivot == r) {
            print(arr, r);
            return;
        }

        for (int i = pivot; i < n; i++) {
            swap(arr, i, pivot);
            perm(arr, pivot + 1, n, r);
            swap(arr, i, pivot);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
