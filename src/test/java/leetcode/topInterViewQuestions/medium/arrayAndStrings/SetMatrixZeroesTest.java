package leetcode.topInterViewQuestions.medium.arrayAndStrings;

import leetcode.topInterViewQuestions.medium.arrayAndStrings.SetMatrixZeroes;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-05 4:19 오후
 */
public class SetMatrixZeroesTest {

    @Test
    public void test() {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

        assertTrue(Arrays.deepEquals(expected, SetMatrixZeroes.setZeroes(arr)));
    }
}