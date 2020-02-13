package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import org.junit.Test;

import static leetcode.topInterViewQuestions.medium.treesAndGraphs.PopulatingNextRightPointersInEachNode.*;

/**
 * Created by kimchanjung on 2020-02-13 5:01 오후
 */
public class PopulatingNextRightPointersInEachNodeTest {

    @Test
    public void test() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        connect(node);
    }
}