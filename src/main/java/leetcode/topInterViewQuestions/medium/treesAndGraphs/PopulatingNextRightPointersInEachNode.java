package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import hackerrank.Node;

import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-02-13 5:00 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/789/
 * [Populating Next Right Pointers in Each Node]
 * <p>
 * 아래처럼 완전 2진 트리가 주어지면
 * 1
 * 2     3
 * 4    5 6   7
 */
public class PopulatingNextRightPointersInEachNode {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;

        }
    }

    /**
     * level order 순회 방식을 사용하여 풀이
     * level 단위로 순회 하여 각 레벨에서 적절히 next를 지정 해주는 풀이법
     * @param root
     * @return
     */
    public static Node connect2(Node root) {

        Queue<List<Object>> queue = new LinkedList();
        queue.offer(Arrays.asList(root, 1));

        while (!queue.isEmpty() && root != null) {
            List<Object> poll = queue.poll();
            Node node = (Node) poll.get(0);
            Integer level = (Integer) poll.get(1);

            System.out.print(node.val + " -> ");

            if (queue.peek() != null && queue.peek().get(1) == level) {
                node.next = (Node) queue.peek().get(0);
            }

            if (node.left != null) {
                queue.offer(Arrays.asList(node.left, level + 1));
            }

            if (node.right != null) {
                queue.offer(Arrays.asList(node.right, level + 1));
            }
        }

        return root;
    }


    /**
     * 재귀를 이용한 방법인데 사실 전위, 중위, 후위 등 순서에 상관없이
     * 일단 모든 노드를 일정 탐색 법칙의 규칙에 상관 없이 탐색을 하면서 level만 잘 넣어 주고
     * 단 해당 레벨에서는 순서는 왼쪽에서 오른쪽 순서는 유지한다.(그래야 next를 지정 할 수 있다.)
     * map 에 level을 키값으로 node를 넣어두고 추후 노드를 탐색 하면서
     * 해당 레빌의 노드가 없으면 새로 level, node 생성
     * 해딩 level의 node가 있으면 먼저 탐색 했던 같은 레벨의 node 이므로 이노드의 next 를 지정해두고
     * 해당 level의 node를 자기 자신 노드로 바꿔 놓는다.
     *
     * 정말 쌈박한 방법....
     *
     */
    public static HashMap<Integer, Node> map = new HashMap<>();

    public static Node connect(Node root) {
        return dfs(root, 0);
    }

    public static Node dfs(Node root, int level) {
        if (root == null) return null;

        if (map.get(level) != null) {
            Node n = map.get(level);
            n.next = root;
        }

        map.put(level, root);

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);

        return root;
    }
}
