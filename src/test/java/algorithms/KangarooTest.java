package test.java.algorithms;

import main.java.algorithms.Kangaroo;
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


    @Test
    public void test2() {
        int x1 = 21, v1 = 6, x2 =47, v2 = 3;

        float same = (float) (x1 - x2) / (float)(v1 - v2);
    }

}