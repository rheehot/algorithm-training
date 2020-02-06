package hackerrank.algorithms;

import hackerrank.algorithms.Kangaroo;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class KangarooTest {

    @Test
    public void test() {
        //Given
        int x1 = 21, v1 = 6, x2 =47, v2 =3;

        //When
        String result = Kangaroo.kangaroo(x1, v1, x2, v2);

        //Then
        assertThat("result is :", result, is("NO"));
    }


    /**
     * t = 점프 횟 수
     * x1 + t * v1 = x2 + t * v2
     *
     */
    @Test
    public void test2() {
        int x1 = 21, v1 = 6, x2 =47, v2 = 3;

        float same = (float) (x1 - x2) / (float)(v1 - v2);
    }

}