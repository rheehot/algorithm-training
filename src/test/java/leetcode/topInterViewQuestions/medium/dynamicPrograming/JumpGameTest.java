package leetcode.topInterViewQuestions.medium.dynamicPrograming;

import leetcode.topInterViewQuestions.medium.dynamicPrograming.JumpGame;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-04 4:06 오후
 */
public class JumpGameTest {

    @Test
    public void test() {
        assertEquals(true, JumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(false, JumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
        assertEquals(true, JumpGame.canJump(new int[]{2,0,0}));
        assertEquals(true, JumpGame.canJump(new int[]{1,2}));
        assertEquals(false, JumpGame.canJump(new int[]{0,2,3}));
    }
}