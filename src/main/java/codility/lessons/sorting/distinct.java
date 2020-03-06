package codility.lessons.sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kimchanjung on 2020-03-06 4:37 오후
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 * [distinct]
 * [EASY]
 *
 * 배열에서 중복 값을 제거 하는 문제임
 * stream을 사용하여 중복 제거 할 수 있지만.
 * boxed 즉 int -> Integer 변환 로직이 들어 가기 때문에 O(n) 넘어감
 * 그냥 루프 돌면서 set에 넣어주면 자동 중복 제거 되고 개수를 리턴 하면됨
 *
 */
public class distinct {
    public static int solution(int[] A) {
        Set set = new HashSet();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        return set.size();
    }
}
