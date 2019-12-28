package main.java.interviewkit.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * [REMIND]
 * https://www.hackerrank.com/challenges/matrix
 * 어렵다
 *       (5)   (8)   (5)
 *   (0)  -  1  - (2)  - (4)
 *           | (4)
 *           3
 *
 *  위 처럼 그래프가 존재 한다  0,2,4 처럼 표시된(기계) 노드는 서로 연결되면 안된다. 서로 연결되지 않게 간선을 제거하는 최소 비용을 찾는다.
 *       (5)   (8)   (5)
 *   (0)    1  - (2)    (4)
 *           | (4)
 *           3
 *  0,1 = 5
 *  2,4 = 5
 *  위 두 간선을 제거하면 최소 비용으 표시된 노드가 서로 연결되지 않게 된다.
 *
 *  해결책
 *  1. Kruskal 알고리즘을 기본적으로 사용한다.
 *  2. Kruskal 알고리즘과 달리 간선 비용이 높은 것 부터 내림 차순 정렬한다.
 *  3. 노드의 번호를 index로 하는 배열에 기계노드의 경우 true 로 초기화 한다.
 *  4. 간선을 루프 돌면서 양 노드의 부모를 찾는다. => 양노드의 부모가 둘다 기계노드이면 간선비용을 합산.
 *  5. Kruskal 알고리즘에서 같은 부모로(작은 노드) 연결작업을 그대로 수행한다.
 *  6. 간선의 양 노드의 부모 노드가 둘중 하나라도 기계 이면 기계노드로 설정한다.
 *     => 부모노드로 노드를 서로 연결하면서 부모노드를 기계 노드로 만들어 서로 연결되어 있고 멀리떨어져 있는 기계노드가 서로 연결되었는지 판단 여부가 된다.
 *
 *       1
 *     /   \
 *   (2)   (3)
 *
 *   1,2 => 한쪽이 기계이므로
 *   2의 부모가 1이 됨과 동시에 1을 기계노드화 한다.
 *      (1)
 *    /   \
 *  (2)   (3)
 *
 *  1,3 확인 시 1은 부모가 1, 3은 부모가 3
 *  3의 부모도 기계, 1의 부모가 1인데 기계가 아니였다면 2,3이 서로 기계로 연결되어 있다는 것을 알수 없으므로
 *  즉 양쪽 저멀리 (5) - 3- 4- 1- 6 - 7 - (8) 5, 8이 서로 기계 이고 1을 부모로 연결되어 있는데
 *  작업 수행할때 어느 한 노드가 기계인경우 부모노드를 기계로 만들어 버리므로써 다른 노드를 체크 할때 연결된 노드중에 기계노드가 있다는 것을 알게 되어
 *  서로 기계노드로 연결되어 있다는 것을 판단 할 수 있는 것이다.
 */
public class Matrix {
    private static int[] parent;
    private static boolean[] machinesList;

    /**
     * 최상위 부모노드를 찾는다.
     * @param node
     * @return
     */
    private static int findParent(int node) {
        if (parent[node] == node) return node;
        return parent[node] = findParent(parent[node]);
    }

    /**
     * 찾은 부모노드를 현재 노드의 부모노드로 변경하면서 연결작업을 한다.
     * @param road
     * @return
     */
    private static int union(int[] road) {
        int parent1 = findParent(road[0]);
        int parent2 = findParent(road[1]);

        // 부모 노드가 둘다 기계라면 간선 비용을 리턴
        if (machinesList[parent1] && machinesList[parent2]) return road[2];

        // 양 노드의 최상위 부모를 찾아서 낮은쪽 부모로 변경하여 연결한다.
        if (parent1 < parent2) {
            parent[parent2] = parent1;
        } else {
            parent[parent1] = parent2;
        }

        // 양 부모노드가 둘중 하나라도 기계라면, 해당 부모노드를 기계노드로 만든다.
        machinesList[parent1] |= machinesList[parent2];
        machinesList[parent2] |= machinesList[parent1];

        return 0;
    }

    public static int minTime(int[][] roads, int[] machines) {
        machinesList = new boolean[roads.length + 1];
        parent = IntStream.range(0, roads.length + 1).toArray();
        Arrays.stream(machines).forEach(v -> machinesList[v] = true);
        Arrays.sort(roads, (x, y) -> Integer.compare(y[2], x[2])); // 간선비용이 큰순서로 내림차순 정렬한다.

        return Arrays.stream(roads).mapToInt(Matrix::union).sum();
    }

    public static void main(String[] args) throws IOException {

        String path = Paths.get("").toAbsolutePath().toString()+"/src/testcase-file/";
        BufferedReader br = new BufferedReader(new FileReader(path+"matrix.txt"));

        String s = br.readLine();

        String[] nk = s.split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] roads = new int[n - 1][3];

        for (int i = 0; i < n - 1; i++) {
            String[] roadsRowItems = br.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int roadsItem = Integer.parseInt(roadsRowItems[j]);
                roads[i][j] = roadsItem;
            }
        }

        int[] machines = new int[k];

        for (int i = 0; i < k; i++) {
            int machinesItem = Integer.parseInt(br.readLine());
            machines[i] = machinesItem;
        }

        int result = minTime(roads, machines);


        System.out.println("result = "+result);
        br.close();

    }

}
