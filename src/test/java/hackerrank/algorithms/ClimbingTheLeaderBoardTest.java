package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.ClimbingTheLeaderBoard;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ClimbingTheLeaderBoardTest {

    @Test
    public void test() {
        //Given
        int[] leaderBoard = {1};
        int[] aliceScore = {1,1};

        //When
        int[] result = ClimbingTheLeaderBoard.climbingLeaderboard(leaderBoard, aliceScore);

        for (int item: result) {
            System.out.print(item+" ");
        }

        //Then
        assertArrayEquals(new int[]{1,1}, result);
    }

}