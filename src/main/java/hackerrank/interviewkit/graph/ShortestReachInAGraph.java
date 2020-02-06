package hackerrank.interviewkit.graph;

import java.util.*;

/**
 * hackerrank.com/challenges/ctci-bfs-shortest-reach
 *
 * 그래프에서 출발 노드로 부터 연결된 각노드의 간선 가중치 비용을 출력 하는 문제
 *
 *               1
 *          (6) /  \ (6)
 *            3     2
 *                   \ (6)
 *      5             4
 *
 *  1, 2, 3, 4 는 서로 연결되어 있다
 *
 *  2 = 6 (1 => 2 = 6)
 *  4 = 12 (1 => 2 => 3 = 12)
 *  3 = 6 (1 => 3 = 6)
 *  5 = -1 (혼자 떨어져 있으므로 -1)
 *
 *  출력은 아래와 같다. 탐색 순서와 관계없이 노드 번호 순서대로 가중치 비용을 출력해야한다,
 *   6,  6, 12,  -1
 *  (2) (3) (4) (5)
 *
 *  해결책
 *  1. 기본 적으로 BFS 알고리즘을 기본으로 사용한다.
 *  2. 노드번호를 index로 가지고 하위 노드를 리스트로 가지는 그래프 데이터를 생성한다 List<Interger>[]
 *  3. 출발 점으로 부터 각 노드의 간선 가중치 비용을 담을 배열을 생성한다. 기본적으로 -1로 전부 생성
 *     => 연결된 노드는 가중치를 계산하여 채워 질 것이며 연결되지 않은 노드는 BFS탐색을 자체를 하지 않아서  -1이 그대로 남게 됨
 *  4. 기존 BFS 알고지금과 동일 하게 작성하고 인접 노드를 처리하는 부분에 부모노드의 가중치 + 6 하여 본인 노드의 가중치를 저장한다.
 *  5. 가중치 배열을 리턴한다 BFS 하게 되면 노드 번호가 낮은 노드 부터 처리 하게 되서 문제에서 원하는 순서로 탐색이 안되지만
 *     => edgeWeight[node] 가중치 배열에 노드 번호로 저장 되기 때문에 출력은 노드 번호가 낮은 순서로 출력되니 상관없다.
 *
 *  ## 이문제는 출발 노드 번호, 그래프 구성을 위한 노드 번호를 -1 해서 제공 한다.
 *  ## 즉 입력값은 1, 2, 3 이만 파라메터로 들어오는 값은 0,1,2 로 들어온다
 *  ## 노드 구성할때 배열이 0부터 시작하는 것을 고려해서 아예처음 부터 그렇게 제공하니 인덱스 번호와 노드번호를 유의해서 처리 하면됨
 *  ## 가중치 출력도 출발 노드는 0인데 배열에 담겨 있는데 문제 자체에서 첫번째 요소는 제거한다(친절하지만 오히려 더 햇갈리게함ㅋㅋ)

 */
public class ShortestReachInAGraph {
    public static class Graph {
        // 노드 데이터
        private List<Integer>[] nodes;
        // 방문여부
        private boolean[] visited;
        // 개별 노드 간선 가중치 비용
        private int[] edgeWeight;

        /**
         * 데이터 초기
         * @param size
         */
        public Graph(int size) {
            nodes = new ArrayList[size];
            edgeWeight = new int[size];
            visited = new boolean[size];
            Arrays.fill(edgeWeight, -1);  // 모든 노드의 가중치 비용을 -1로 초기

            for (int i = 0; i < size ; i++) {
                nodes[i] = new ArrayList<>();
            }
        }

        /**
         * 노드 연결 처리
         * @param first
         * @param second
         */
        public void addEdge(int first, int second) {
            nodes[first].add(second);
            nodes[second].add(first);
        }

        public int[] shortestReach(int startId) {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(startId);
            edgeWeight[startId] = 0;
            visited[startId] = true;

            while (!queue.isEmpty()) {
                Integer node = queue.poll();
                for (Integer adjacencyNode : nodes[node]) {
                    if (!visited[adjacencyNode]) {
                        queue.offer(adjacencyNode);
                        visited[adjacencyNode] = true;
                        edgeWeight[adjacencyNode] = edgeWeight[node] + 6; // 부모노드의 가중치에 + 6하여 저장
                    }
                }
            }

            return edgeWeight;
        }
    }

}
