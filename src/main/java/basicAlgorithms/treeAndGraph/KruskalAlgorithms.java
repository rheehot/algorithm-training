package basicAlgorithms.treeAndGraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Kruskal 알고리즘
 *  아래 처럼 그래프가 연결된 경우 모든 노드를 최소 비용으로 연결하는 것이 목적
 *        1
 *  (1) /   \ (2)
 *     2  -  3
 *       (3)
 *
 *  즉  1 - 2, 1 - 3, 2 - 3 이 순환 되도록 연결이 되어 있는데 2개의 간선만 연결 시키면 된다
 *  => 최소 비용의 간선을 찾아 연결 즉 1 -(1)- 2, 1 -(2)- 3 연결하면 최소비용으로 연결된 셈이다
 *        1
 *  (1) /   \ (2)
 *     2    3
 *
 *  알고리즘 로직
 *
 *  1. 일단 모든 노드의 부모 노드를 가리키는 배열을 만든다 이배열은 서로 연결되어 있다는 것을 판단 하기위해 사용하는 것
 *     초기 값은 노드 자기 자신이 부모가 되도록 설정한다.
 *     노드 1 2 3
 *     부모 1 2 3
 *
 *  2. 간선 정보를 간선 비용이 작은 것 부터 오름 차순으로 정렬한다.
 *     => 간선 비용이 낮은 값 부터 차례로 연결하고 순환 되는 간선은 연결하지 않도록 하여 최종적으로 적은 비용은 간선으로 모든 노드를 연결하여 최소 비용을 찾아 낸다.
 *     간선비용  |  1  |  2  |  3  |
 *     양쪽노드  | 1,2 | 1,3 | 2,3 |
 *
 *  3. 첫 번째 간선의 두 노드의 부모를 찾는다.
 *     => 초기에는 1=1, 2=2 다 서로 부모가 다르므로 연결, 더 낮은 부모 노드로 변경한다.
 *        2의 부모는 1이 되었고 1,2의 부모는 1이 되었고 연결되었다. 간선 비용도 합산에 포함 1
 *        노드 1 2 3
 *        부모 1 1 3
 *     => 1,3  부모가 초기에 1,3 이므로 낮은 쪽 부모로 합친다. 간선비용도 포함 1+2
 *        노드 1 2 3
 *        부모 1 1 1
 *     => 2,3 2의 부모 1, 3의 부모 1 같다 이미 연결되었으므로 연결작업 하지 않고 간선비용 미포함
 *
 *     최소 연결 간선 비용 1+2 =  3 이다.
 *
 */
public class KruskalAlgorithms {
    public static class Edge implements Comparable<Edge> {

        private int node1;
        private int node2;
        private int weight;

        public Edge(int node1, int node2, int weight) {
            this.node1 = node1;
            this.node2 = node2;
            this.weight = weight;
        }

        public int getNode1() {
            return node1;
        }

        public int getNode2() {
            return node2;
        }


        @Override
        public int compareTo(Edge o) {
            return this.weight > o.weight ? -1 : 1;
        }
    }


    private static int[] parent;
    private static List<Edge> edgeList;

    /**
     * 해당 노드의 부모를 찾는다.
     * 1 <- 2 <- 3
     * 1    1    2
     * 3의 부모가 2인 경우 2의 부모를 찾는다
     * 3 != 2
     * => 2 != 1
     * => 1 == 1
     * 최상의 부모까지 찾아서 3의 부모가 2가 되는게 아니라 2의 무보 1(1은 부모가 자신이므로)이 3의 부모가 1임을 찾는다.
     * @param node
     * @return
     */
    private static int findParent(int node) {
        System.out.println("node = "+node+", parent = "+parent[node]);
        if (parent[node] == node) return node;

        return parent[node] = findParent(parent[node]);
    }

    /**
     * 간선의 양 노드의 최상위 부모를 찾아서 노드의 무모가 큰 노드의 부모를 작은 노드의 부모 값으로 변경한다
     *    3 != 2
     * => 2 != 1
     * => 1 == 1
     * 3의 부모값 1을 찾아서 => 처음 3의 부모값 2에서 1로 변경하여 연결한다,
     * @param edge
     */
    private static void union(Edge edge) {
        int parent1 = findParent(edge.getNode1());
        int parent2 = findParent(edge.getNode2());

        if (parent1 < parent2) {
            parent[parent2] = parent1;
        } else {
            parent[parent1] = parent2;
        }
    }

    // 부모가 같은지(이미 연결되었는지 판단)
    private static boolean isNotSameParent(Edge edge) {
        return findParent(edge.getNode1()) != findParent(edge.getNode2());
    }

    public static int findShortest(List<Edge> inputs) {
        int sumEdgeWeight = 0;
        edgeList = inputs;
        parent = IntStream.range(0, edgeList.size()+1).toArray();
        Collections.sort(edgeList); //간선 가중치 오름차순 정렬

        for (Edge edge:edgeList) {
            System.out.println("weight = "+edge.weight);
            if (isNotSameParent(edge)) { // 두 노드의 무보가 서로같지 않은경우(연결되어 있지 않은경우만 연결하고 간선비용에 합산한다
                sumEdgeWeight += edge.weight;
                union(edge);
            }
        }

        Arrays.stream(parent).forEach(v -> System.out.printf(v + " "));
        System.out.printf("sum = "+sumEdgeWeight);
        return sumEdgeWeight;

    }
}
