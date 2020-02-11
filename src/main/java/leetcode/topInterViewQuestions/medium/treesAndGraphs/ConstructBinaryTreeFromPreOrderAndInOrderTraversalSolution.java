package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-02-11 1:27 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/788
 * [Construct Binary Tree from Preorder and Inorder Traversal]
 * [REMIND]
 * 전위탐색, 중위탐색 순서의 값을 주고
 * 트리를 구성하는 문제 즉 해당 노드 의 자식 노드가 오른쪽, 왼쪽 중에 어디에 넣을 거냐를 결정해서
 * 트리를 생성 하는 문제 .. 어렵...
 */
public class ConstructBinaryTreeFromPreOrderAndInOrderTraversalSolution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    private static int preIndex = 0;
    private static int[] preOrder;
    private static int[] inOrder;

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex = 0;
        preOrder = preorder;
        inOrder = inorder;

        return recursive( 0, inorder.length - 1);
    }


    private static TreeNode recursive(int from, int to) {
        System.out.print(" from = "+from+", to = "+to);
        if (from > to) return null;

        TreeNode tNode = new TreeNode(preOrder[preIndex++]);

        if (from == to)
            return tNode;

        // 해당 노드가 inOrder에 어느곳에 있는지 index를 찾는다
        int inIndex = IntStream.range(from, to).filter(i -> inOrder[i] == tNode.val).findFirst().orElse(to);

        /**
         * preorder = [3,9,20,15,7]
         * inorder = [9,3,15,20,7]
         * 3의 왼 노드 9는
         *   => inOrder 3의 왼쪽 범위 즉 0 ~ 0 범위에 있으므로 왼쪽이됨
         * 3의 오른 노드 20은 는
         *  => inOrder 3의 오른 범위 2 ~ 4 범위에 있으므로 오른쪽이됨
         *
         * 9는 왼쪽의 마지막이므로 노드를 리턴하고 더이상 하위 노드를 검색하지 않음
         *
         * 20의 왼쪽 노드 15
         *   => 0 ~ 2 사이에 존재하므로 왼쪽이됨
         * 20의 왼쪽 노드 7
         *   => 4 ~ 4 사이에 존재하므로 오른쪽이됨, 오른쪽 마지막 노드라 하위 노드를 검핵하지 않고 종료
         */
        tNode.left = recursive(from, inIndex - 1); // 부모 노드 앞쪽 범위에 있다면 왼쪽 이다.
        tNode.right = recursive(inIndex + 1, to); // 부모 노드의 오른쪽 범위에 있다면 오른쪽이다.

        return tNode;
    }
}
