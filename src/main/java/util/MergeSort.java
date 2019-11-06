package main.java.util;


/**
 * 병합정렬
 *
 * 4 3 2 1 있는 경우
 * 원소가 1개가 될때 까지 2개로 나눈다.
 *          4 3        2 1
 *        4     3    2     1
 *
 * 2, 1 을 정렬 하여 [3,4] 합친다
 * 4 ,3 을 정렬 하여 [1,2] 합친다.
 *
 * 다시 [3,4], [1,2] 을 비교 하여 [1,2,3,4] 합친다.
 *
 * 해결책
 * A. 처음 배열과  왼쪽시작 값, 오른쪽 마지막 값을 받는 메소드를 만든다 => 배열을 원소가 1개 일때 까지 개속 해서 반으로 나누기 위함이다.
 *    => 왼쪽(1 ~ 2), 오론쪽(3~4) 각각 재귀함수로 호출 한다.
 * B. 각각 오른쪽 왼쪽이 개별 원소가 1개가 될때까지 반으로 나눈다음 둘을 정렬후 합치는 메소드를 실행한다.
 *  1. 원래배열, 왼쪽시작, 중간, 오른쪽 끝 값을 파라메더로 받는 메소드를 만든다.
 *  2. 원래배열의 길이와 같은 임시 배열을 만든다.
 *  3. 배열을 반으로 나눈 구간을 루프를 돌면서 정렬한다.
 *     => [3, 4] [1, 2] => 3  1 비교 => 둘중 작은 수를 temp에 넣고 index증가, 넣은쪽 index증가(왼쪽, 오른쪽)
 *     => 반복하면 왼쪽,오른쪽 둘중 하나가 끝까지 채워지면 즉 => 3 1 => 1 => 3 2 => 1 2 가 되고 이경우
 *        오른쪽이 모두 정렬되어 temp 에 입력 되었으므로 루프를 중단한다.
 *  4. 왼쪽, 오른쪽 비교 하여 정렬하다가 어느한쪽이 끝나면서 루프가 종료 되었고 다음은 나머지 쪽을 그대로 순서대로 넣으면 된다
 *     이유는 왼쪽 오른쪽은 서로 정렬이 안되어 있지만 왼쪽, 오른쪽 각각은 정렬이 되어진 상태이기 때문에 한쪽이 끝났으면 나머지는 그대로 순서대로 넣으면 정렬순서가 맞아 떨어진다.
 *
 *  5. 왼쪽인덱스 <= 중간값 일때까지 temp에 이어서 넣는다.
 *     => 왼쪽이 아직 처리가 채워지지 않은 채로 끝났다면 왼쪽인덱스는 중앙값보다 적을 테니 루프를 수행한다. tempIndex 증가 leftIndex 증가
 *
 *  6. 오른족인덱스 <= 오른쪽끝값 일때 까지 temp에 이어서 넣는다
 *     => 오른이 아직 처리가 채워지지 않은 채로 끝났다면 오른인덱스는 오른쪽 끝 값보다 적을 테니 루프를 수행한다. tempIndex 증가 rightIndex 증가
 *
 *  7. 원래배열에 정렬된 temp를 채워 넣는다
 *     => 원래 배열을 채워 넣는 시작은 왼쪽시작 부터 tempIndex 까지 루프를 돌면서 채워 넣는다
 *     => 1 2 3 4 에서 3 4를 부분을 정렬후 채워 넣는다 치면 시작이 3이고 4가 tempIndex까지 이므로..
 *
 *
 *
 */

public class MergeSort {

    public static void sort(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (left < right) {
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int leftIndex = left;
        int rightIndex = mid+1;
        int tempIndex = 0;

        int[] temp = new int[arr.length];

        while (leftIndex <= mid && rightIndex <= right) {
            if (arr[leftIndex] > arr[rightIndex]) {
                temp[tempIndex++] = arr[rightIndex++];
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
            arr[i] = temp[i-left];
        }
    }

}

