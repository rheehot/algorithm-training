package programmers.codingTestKit.dfsbfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43162
 * 코딩테스트 연습
 * 깊이/너비 우선 탐색(DFS/BFS)
 * 네트워크
 *
 * 이문제는
 *
 *     1
 *   /
 *  2    3
 *
 *  라고 한다면 서로 연결된 그래프의 그룹이 몇개 이냐 찾는 문제다
 *
 *  1,2 = 1개 ,3 = 1 개  =  총 2개가 된다.
 *
 *  처음에는 union-find로 풀려고 했으나 그럴 필요 없이
 *  dfs로 가능하다
 *
 *  즉 1,2,3 -> 노드가 있다면 dfs를 할때 1,2,3 각각 출발 노드로 하여 dfs 탐색을 하는데
 *  1. 1번 노드를 출발으로 탐색을 해서 연결되어 있는 노드는 모두 방문상태가 되고
 *  2. 2번 노드가 1번과 연결되어 있는 경우 이미 방문했기 때문에 제외하고 방문하지 않은 노드 3을 탐색한다.
 *  3. 이렇게 해서 탐색한 노드의 개수를 카운트하면 그룹화된 그래프 그룹의 개수가 나온다.
 *
 */
public class Lessons43162 {
    private static int[][] nodes;
    private static boolean[] visited;

    public static int solution(int n, int[][] computers) {
        nodes = computers;
        visited = new boolean[n];
        return IntStream.range(0, n).map(i -> visited[i] ? 0 : dfs(i)).sum();
    }

    private static int dfs(int node) {
        if (visited[node]) return 1;
        visited[node] = true;
        return IntStream.range(0,nodes[node].length)
                .map(i -> nodes[node][i] == 1 ? dfs(i) : 0)
                .max().getAsInt();
    }

}
