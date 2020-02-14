package basicAlgorithms.treeAndGraph;

import java.util.*;

/**
 * 깊이 우선 탐색
 */
public class DFS {
    static List<Integer>[] nodes;
    static boolean[] visited;
    static List<Integer> route = new ArrayList<>();

    public static int[] search(List<Integer>[] nodeData, int start) {
        nodes = nodeData;
        visited = new boolean[nodes.length];
        dfs(start);

        route.forEach(v -> System.out.printf(v + " "));
        System.out.println();
        return route.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 재귀 함수 버전 (되도록 재귀함수 버전이 그래프, 트리에서도 정상동작함)
     * @param node
     */
    public static void dfs(int node) {
        if (visited[node]) return;
        visited[node] = true;
        route.add(node);

        for (int subNode : nodes[node]) {
            dfs(subNode);
        }
    }

    /**
     * 스택 버전 (그래프, 트리 에 따라 미세하게 처리가 달라짐)
     * 스택버전은 여기저기 코드가 많이 다르다 이유는 그래프 일 때와 트리일 때 처리 부분의 미세한 차이로 구현이 달라진다
     * 트리의 경우 간선이 순환되도록 연결되어 있지 않고
     * 그래프의 경우는 간선이 순환되는 경우도 있기 때문에 어떤 코드는 제대로 동작하지 않는다.
     * 아래 코드는 그래프의 경우에도 정상 동작함
     *
     *       1         1
     *      / \       / \
     *     2 - 3     2   3
     *     그래프       트리
     *
     * @param nodes
     * @param start
     * @return
     */
    public static int[] searchByStack(List<Integer>[] nodes, int start) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> route = new ArrayList<>();
        visited = new boolean[nodes.length];
        stack.push(start);

        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            if (visited[node]) continue;

            route.add(node);
            visited[node] = true;

            for (int i = nodes[node].size() - 1; i >= 0; i--) {
                Integer adjacencyNode = nodes[node].get(i);

                if (!visited[adjacencyNode]) {
                    stack.push(adjacencyNode);
                }
            }

            System.out.println("stack");
            stack.forEach(v -> System.out.println(v));
        }


        route.forEach(v -> System.out.printf(v + " "));
        return route.stream().mapToInt(Integer::intValue).toArray();
    }


}
