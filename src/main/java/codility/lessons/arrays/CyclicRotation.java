package codility.lessons.arrays;



/**
 * Created by kimchanjung on 2020-03-05 4:43 오후
 * https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 * [Cyclic Rotation]
 * [EASY]
 *
 * [1,2,3,4,5] K = 3 이 주어지면
 * K 만큼 마지막 값을 맨앞으로 시프트 한다
 *
 * [5,1,2,3,4]
 * [4,5,1,2,3]
 * [3,4,1,2,3]
 *
 * 처음에 시프트한 상태의 index를 계산 하는 방법이 예외가 생겨 맞지 않았고
 *
 * 결국 현재 (index + K) % A.length 하면 정확하게 K만큼 시프트한 인덱스가 생성됨
 */
public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        int[] ret = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            ret[(i + K) % A.length] = A[i];
        }

        return ret;
    }
}
