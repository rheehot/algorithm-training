package hackerrank.interviewkit.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://www.hackerrank.com/challenges/find-the-nearest-clone
 * [Find the nearest clone]
 * [MEDIUM]
 *
 * 그래프 용어 정리
 * http://www.ktword.co.kr/word/abbr_view.php?m_temp1=4725
 *
 * 그래프가 있고 각 그래프는 색깔 번호를 가지고 있다
 * 같은 색 노드 출발 -> 도착 까지 최단 경로를 찾는 문제
 * 같은 색 노드가 없으면 -1을 출력
 *
 *        1(color = 2)
 *           /       \
 *    2(color = 1)  4(color = 6)
 *       /             \
 * 3(color = 5)       5(color = 1)
 *
 * 2번 노드로 부터 5번 노드 까지의 간선은 3이며 현재 상황에서 최단 경로임
 *
 * 해결책
 * 1. 초기 그래프를 구성하는 데이터를 생성한다 (구지 번호, 컬러, 출발점 까지 거리 값을 가지는 클래스 형태로 구성하지 않아도됨)
 *  => 배열의 인엑스가 노드번호가 되고 하위에 인접노드들을 가지는 리스트 형태로 구성 array[i].get(i) 형태
 *
 * 2. 그래프의 번호를 index로  가지는 color 값 시작노드로 부터의 간선 개수 배열을 만들어 활용한다
 *  =>  nodeColors[nodeNum], edgeCount[nodeNum] 형태로 관리하면 클래스형태로 구지 만들지 않아도 됨
 *
 * 3. 구성된 노드들을 순회 하여 각 노드를 출발점으로 BFS 한다, 단 찾는 컬러인 노드의 경우만 BFS를 수행한다.턴
 *   => BFS 탐색으로 찾은 간선 개수 중 가장 작은 값을 리턴한다.
 *
 * 4. 기본적인 BFS 알고리즘에서 추가 되는 부분은
 *   => 개별 인접 노드들을 처리할 때 인접 노드의 컬러가 찾는 컬러 라면 인접 노드의 부모 노드의 간선 개수 + 1 값을 리턴하면서 함수 종료
 *   => 아니라면 부모노드의 간선 개수 + 1을 현재 처리중인 인접노드의 간선 개수 값에 저장한다.
 *   => 같은 색의 노드를 찾지 못했다면 -1을 리턴
 */
public class FindTheNearestClone {
    // 그래프 탐색을 위해 생성할 node 데이터
    private static List<Integer>[] nodes;
    // 그래프 번호를 index 로 하는 간선 개수 노드 시작으로 부터 간선 개수를 개별 노드가 저장 하고 있고 같은 색노드를 발견할 때 해당 노드의 간선 개수가 최단 거리 값이 됨
    private static int[] edgeCount;
    // 그래프 번호를 index 로 하는 색깔 번호
    private static long[] nodeColors;
    // 찾을 색깔 번호
    private static int findColor;

    /**
     * 데이터 초기화 및 생성
     * @param graphNodes
     * @param graphFrom
     * @param graphTo
     * @return
     */
    private static void init(int graphNodes, int[] graphFrom, int[] graphTo) {
        nodes = new ArrayList[graphNodes+1];
        edgeCount = new int[graphNodes];

        // 노드 그래프 데이터 초기화
        for (int i = 0; i <= graphNodes; i++) {
            nodes[i] = new ArrayList<>();
        }

        // 노드 그래프 데이터 생성
        for (int i = 0; i < graphFrom.length; i++) {
            nodes[graphFrom[i]].add(graphTo[i]);
            nodes[graphTo[i]].add(graphFrom[i]);
        }
    }

    /**
     * 메인 처리 로직 메소드
     * @param graphNodes
     * @param graphFrom
     * @param graphTo
     * @param ids
     * @param val
     * @return
     */
    public static int findShortest(int graphNodes, int[] graphFrom, int[] graphTo, long[] ids, int val) {
        init(graphNodes, graphFrom, graphTo);
        nodeColors = ids;
        findColor = val;
        int minEdgeCount = graphNodes;

        // 노드들을 순회 하면서 해당 노드들을 출발점으로 BFS 탐색(단 찾는 걸러값을 가진 노드만 탐색)
        for (int i = 1; i < graphNodes; i++) {
            if (nodeColors[i-1] != findColor) continue;
            minEdgeCount  = Math.min(BFS(i), minEdgeCount);
        }

        return minEdgeCount == graphNodes ? -1 : minEdgeCount;
    }

    /**
     * BFS 메소드
     * @param start
     * @return
     */
    private static int BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nodes.length];
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            Integer node = queue.poll();

            for (Integer adjacencyNode : nodes[node]) {
                if (!visited[adjacencyNode]) {
                    int currentEdgeCount  = edgeCount[node-1] + 1;
                    // 인접 노드의 컬러가 찾는 컬러와 일치 할경우 부모 노드의 간선 + 1 하여 리턴
                    if (nodeColors[adjacencyNode-1] == findColor) return currentEdgeCount;

                    // 인접 노드가 찾는 노드가 아닌 경우에도 부모노드의 간선 개수+1 하여 본인의 간선 개수를 저장 관리
                    edgeCount[adjacencyNode-1] = currentEdgeCount;
                    queue.offer(adjacencyNode);
                    visited[adjacencyNode] = true;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        String path = Paths.get("").toAbsolutePath().toString()+"/src/testcase-file/";
        BufferedReader br = new BufferedReader(new FileReader(path+"find-the-nearest-clone.txt"));

        String[] graphNodesEdges = br.readLine().split(" ");
        int graphNodes = Integer.parseInt(graphNodesEdges[0].trim());
        int graphEdges = Integer.parseInt(graphNodesEdges[1].trim());

        int[] graphFrom = new int[graphEdges];
        int[] graphTo = new int[graphEdges];

        for (int i = 0; i < graphEdges; i++) {
            String[] graphFromTo = br.readLine().split(" ");
            graphFrom[i] = Integer.parseInt(graphFromTo[0].trim());
            graphTo[i] = Integer.parseInt(graphFromTo[1].trim());
        }

        long[] ids = new long[graphNodes];

        String[] idsItems = br.readLine().split(" ");

        for (int i = 0; i < graphNodes; i++) {
            int idsItem = Integer.parseInt(idsItems[i]);
            ids[i] = idsItem;
        }

        int val = Integer.parseInt(br.readLine().split(" ")[0]);
        br.close();

        int ans = findShortest(graphNodes, graphFrom, graphTo, ids, val);


        br.close();
    }
}
