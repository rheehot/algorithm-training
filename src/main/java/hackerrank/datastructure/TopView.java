package hackerrank.datastructure;

import hackerrank.Node;


import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * https://www.hackerrank.com/challenges/tree-top-view/
 * [Tree : Top View]
 * [EASY]
 *
 * 탑뷰로 보이는 값을 왼쪽 부터 리턴
 *
 * 즉 1의 지점에서 보았을때 밖에서 보이는 부분을 리턴하는 문제이다
 *
 * 	            2 : level = 0
 * 	  1 : level = -1        5 : level = 1
 * 	            3 : level = 0             6 : level = 2
 * 	                        4 : level = 1
 *
 *  1 -> 2 -> 5 -> 6 만 보이게 된다
 *
 *  방법은
 *
 *  1) 일단 방법은 레벨 탑색 법을 이용해서 일단 탐색을 한다.
 *
 *  2) 탐색 하면서 root = 0을 기준으로 자식 노드로 내려갈때 부모 레벨 값에서 왼쪽은 -1만큼, 오른쪽은 +1을 해서 각 노드의 레벨을 매긴디
 *
 *  3) map에 key 값을 level로 해서 노드의 값을 저장해 두고 출력하면 낮는 키값부터 차례대로 출력한다.
 *
 *  결론적으로 -1, 0, 1, 2  의 레벨을 가진 값들이 출력된다
 *
 *  1 -> 2 -> 5 -> 6 이렇게
 *
 */
public class TopView {
    static class QueueNode {
        Node node;
        int level;

        public QueueNode(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void topView(Node root) {

        Queue<QueueNode> queue = new LinkedList<>();
        TreeMap<Integer, Integer> mapData = new TreeMap<>();
        queue.offer(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode queueNode = queue.poll();

            if (!mapData.containsKey(queueNode.level)) mapData.put(queueNode.level, queueNode.node.data);


            if (queueNode.node.left != null) {
                queue.offer(new QueueNode(queueNode.node.left, queueNode.level - 1));
            }

            if (queueNode.node.right != null) {
                queue.offer(new QueueNode(queueNode.node.right, queueNode.level + 1));
            }
        }

        for (Integer data : mapData.values()) {
            System.out.println(data);
        }

    }
}
