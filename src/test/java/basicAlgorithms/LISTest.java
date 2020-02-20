package basicAlgorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-20 2:35 오후
 */
public class LISTest {

    @Test
    public void test() {
        assertEquals(4, LIS.lis(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void test2() {
        Vector<Integer> v = new Vector<>(Arrays.asList(1,2,3,5));
        //System.out.println(v.size());
        int i = Collections.binarySearch(v, 4);
        System.out.println(i);
        int index = i < 0 ? -i - 1 : i;
        System.out.println(index);

       // assertEquals(4, LIS.lisWithLowerBound(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}