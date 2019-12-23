package main.java.basicAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 넓이 우선 탐색
 */
public class BFS {
    public static int[] search(List<Integer>[] nodes, int start) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nodes.length];
        List<Integer> route = new ArrayList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            Integer node = queue.poll();
            route.add(node);
            for (Integer adjacencyNode : nodes[node]) {
                if (!visited[adjacencyNode]) {
                    queue.offer(adjacencyNode);
                    visited[adjacencyNode] = true;
                }
            }
        }

        route.forEach(v -> System.out.printf(v + " "));
        return route.stream().mapToInt(Integer::intValue).toArray();
    }
}
