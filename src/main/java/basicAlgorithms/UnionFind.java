package basicAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Union-Find
 *
 * 특정 노드들을 서로 연결 처리하고
 * 같은 노드 집합인지 확인한다.
 *
 * 1 - 2
 * 2 - 3
 * 4 - 5
 *
 * 각각 연결된 노드를 구성하고
 * 1,2,3 / 4,5
 *
 * 1,2 는 연결된 노드 1, 4는 연결되지 않은 노드
 */
public class UnionFind {
    private static Map<Integer, Integer> parent = new HashMap<>();

    private static int findParent(int node) {
        if (parent.get(node) == node) return node;
        parent.put(node, findParent(parent.get(node)));

        return parent.get(node);
    }

    private static void union(int node1, int node2) {
        int parent1 = findParent(node1);
        int parent2 = findParent(node2);

        if (parent1 < parent2) {
            parent.put(parent2, parent1);
        } else if (parent1 < parent2) {
            parent.put(parent1, parent2);
        }
    }

    private static boolean isSameParent(int node1, int node2) {
        return findParent(node1) == findParent(node2);
    }


    public static void unionFind(int[][] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            parent.put(nodes[i][0], nodes[i][0]);
            parent.put(nodes[i][1], nodes[i][1]);
        }

        parent.forEach((k, v) -> System.out.println(k+", "+v));

        for (int i = 0; i < nodes.length ; i++) {
            union(nodes[i][0], nodes[i][1]);
            System.out.println(nodes[i][0]+", "+nodes[i][1]+" = "+isSameParent(nodes[i][0], nodes[i][1]));
        }

        parent.forEach((k, v) -> System.out.println(k+", "+v));

    }

}
