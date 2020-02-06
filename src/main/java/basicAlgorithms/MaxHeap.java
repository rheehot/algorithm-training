package basicAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-28 2:19 오후
 * 최대힙 태
 * 자식 보다 부모가 큰값을 가지고 있는 트리 형
 *
 * 입력
 * - 마지막 값 부터 시작
 * - 입력값(자식)이 부모 보다 크면 자리를 변경한다. 그렇지 않으면 변경 할 필요 없이 종료
 * - 자리 변경후 부모 보다 크면 자리 변경을 반복
 *
 * 삭제
 * - 첫번째 값을 꺼낸(삭제다, 제일 큰 값이이 첫번째 이므로 )
 * - 마지막 값을 첫번째로 옯긴다.
 * - 첫번째로 간 마지막 값을 자식 과 비교 한다. 작으면 자리를 변경 => 자식 보다 클 때 까지 반복
 */
public class MaxHeap {
    private List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
        heap.add(Integer.MAX_VALUE);
    }

    public void insert(Integer val) {
        heap.add(val);
        int index = heap.size() - 1;

        while (index > 1 && heap.get(index / 2) < heap.get(index)) {
            swap(index / 2, index);
            index = index / 2;
        }
    }

    public Integer poll() {
        int max = heap.get(1);
        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        maxHeapify(1);
        return max;
    }

    public void maxHeapify(Integer parentIdx) {
        int greatestIdx = parentIdx;
        int leftChildIdx = 2 * parentIdx;
        int rightChildIdx = 2 * parentIdx + 1;

        // 왼쪽 자식이 있고 max(부모, 왼쪽)
        if (leftChildIdx < heap.size() && heap.get(greatestIdx) < heap.get(leftChildIdx)) {
            greatestIdx = leftChildIdx;
        }

        // 오른쪽 자식이 있고 max(max(부모, 왼)쪽, 오른)
        if (rightChildIdx < heap.size() && heap.get(greatestIdx) < heap.get(rightChildIdx)) {
            greatestIdx = rightChildIdx;
        }

        // 무모와 가장 작은 값이 같지 않는 경우
        if (parentIdx != greatestIdx) {
            swap(parentIdx, greatestIdx);
            maxHeapify(greatestIdx);
        }

    }

    private void swap(Integer parentIdx, Integer childIdx) {
        Integer parent = heap.get(parentIdx);
        heap.set(parentIdx, heap.get(childIdx));
        heap.set(childIdx, parent);
    }

    public void print() {
        IntStream.range(1, heap.size()).forEach(i -> System.out.print(heap.get(i) + " "));
        System.out.println();
    }
}
