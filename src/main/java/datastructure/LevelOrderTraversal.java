package main.java.datastructure;

import main.java.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 레벨 탐색
 *     1
 *       \
 *        2
 *         \
 *          5
 *         /  \
 *        3    6
 *         \
 *          4
 *
 * 의 경우 자식 별로 내려 갔을 때
 * 해당자식의 같은 레벨의 오른쪽 왼쪽 모든 값을 출력하고
 * 다음 자식 레벨로 내려간다
 *
 * 1 -> 2 -> 5 -> 3 -> 6 -> 4
 *
 */
public class LevelOrderTraversal {
    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            System.out.printf("%d%1s",node.data,"");

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

    }
}
