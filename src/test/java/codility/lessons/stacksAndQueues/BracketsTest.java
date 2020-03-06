package codility.lessons.stacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-06 5:42 오후
 */
public class BracketsTest {

    @Test
    public void test() {
        assertEquals(1, Brackets.solution("{[()()]}"));
        assertEquals(0, Brackets.solution("([)()]"));
    }
}