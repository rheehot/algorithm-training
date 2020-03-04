package basicAlgorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-04 5:40 오후
 */
public class LCSTest {

    @Test
    public void test() {
        assertEquals(2, LCS.lcs2("HARRY", "SALLY"));
        assertEquals(3, LCS.lcs2("SHINCHAN", "NOHARAAA"));
    }
}