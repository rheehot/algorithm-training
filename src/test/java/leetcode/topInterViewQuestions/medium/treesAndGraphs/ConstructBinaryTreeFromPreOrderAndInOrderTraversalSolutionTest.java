package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-11 1:28 오후
 */
public class ConstructBinaryTreeFromPreOrderAndInOrderTraversalSolutionTest {

    @Test
    public void test() {
        ConstructBinaryTreeFromPreOrderAndInOrderTraversalSolution.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
       // ConstructBinaryTreeFromPreOrderAndInOrderTraversalSolution.buildTree(new int[]{1,2}, new int[]{1,2});
    }
}