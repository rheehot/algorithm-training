package main.java.hackerrank.interviewkit.sorting;

/**
 * https://www.hackerrank.com/challenges/ctci-merge-sort
 *
 * 배열을 정렬하는데 필요한 횟수를 찾는 문제다
 * 그냥은 안되고 merge sort를 이용하여 찾으라고 문제에 되어 있따
 * merge sort 는 이겨 구현 되어 있다.
 * /Users/kimchanjung/dev_home/hackerrank-practice/src/main/java/util/MergeSort.java
 *
 * 기본적인 merge sort에 정렬 횟수를 카운트 하는 부분을 추가 하면된다.
 *
 */
public class CountingInversions {

    private static long count = 0;

    public static long countInversions(int[] arr) {
        count = 0;
        sort(arr, 0, arr.length-1);
        return count;
    }

    static void sort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;

        if (left < right) {
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int leftIndex = left;
        int rightIndex = mid+1;
        int tempIndex = 0;

        int[] temp = new int[right - left + 1];

        while (leftIndex <= mid && rightIndex <= right) {


            /**
             * 이부분 중요하다 정렬 카운트를 하는데 왼쪽이 오른쪽 보다 큰경우 정렬을 하고 카운트 한다
             * 그런데
             * 1) if (left < right) 라이트증가 : 레프트증가
             * 2) if (left > right) 레프트증 :  라이트증가
             * 는 사실 같은 처리 인데도 불구 하고 정렬 카운트를 처리 했을 때
             * 1 번 처럼 하면 카운트가 다르게 된다, 아마도 재귀 호출의 순서 때문일지도 모르겠지만.. 주의!!
             */
            if (arr[leftIndex] > arr[rightIndex]) {
                temp[tempIndex++] = arr[rightIndex++];
                count += mid - leftIndex + 1;
            } else {
                temp[tempIndex++] = arr[leftIndex++];

            }
        }

        while (leftIndex <= mid) {
            temp[tempIndex++] = arr[leftIndex++];
        }

        while (rightIndex <= right) {
            temp[tempIndex++] = arr[rightIndex++];
        }

        for (int i = left; i < rightIndex ; i++) {
            arr[i] = temp[i - left];
        }

    }

}
