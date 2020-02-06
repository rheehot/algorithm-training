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
        //Permutation.perm(arr, 0, 4, 2);
        System.out.println("======");
        for (int i = 0; i < arr.length; i++) {
            Permutation.perm(arr, 0, arr.length, i+1);
        }

    }
}