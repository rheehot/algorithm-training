package basicAlgorithms;

import basicAlgorithms.Permutation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-14 6:49 오후
 */
public class PermutationTest {

    @Test
    public void test() {
        int[] arr = { 1, 7};
        /**
         * 원래 배열 개수를 그대로 조합한 순열만 출력
         * 1,7
         * 7,1
         */
        Permutation.perm(arr, 0, arr.length, 2);
        System.out.println("======");
        /**
         * 1,7 => 아래처럼 출력 개수를 1~배열 개수 까지 증가시키며 모든 순열을 출
         * 1,
         * 7
         * 1,7
         * 7,1
         */
        for (int i = 0; i < arr.length; i++) {
            Permutation.perm(arr, 0, arr.length, i+1);
        }

    }
}