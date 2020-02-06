package basicAlgorithms;

import basicAlgorithms.StockSpanProblem;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockSpanProblemTest {

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0,0,2,2,4}, StockSpanProblem.stockSpan(new int[]{6, 9, 5, 7,4}));
        assertArrayEquals(new int[]{0,0,2,2,4}, StockSpanProblem.stockSpan(new int[]{9, 7,4}));
    }

}