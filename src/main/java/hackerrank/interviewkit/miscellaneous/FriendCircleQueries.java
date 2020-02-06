package hackerrank.interviewkit.miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * [MEDIUM] 2시간
 * https://www.hackerrank.com/challenges/friend-circle-queries
 * 특정 배열을 주고
 * 1 2
 * 3 4
 * 1 3
 * 5 7
 * 5 6
 * 7 4
 * 아래 처럼 연결되어 되어 구성이 된
 * 1   [1,2]
 * 2   [1,2],[3,4]
 * 3   [1,2,3,4]
 * 4   [1,2,3,4],[5,7]
 * 5   [1,2,3,4],[5,7,6]
 * 6   [1,2,3,4,5,6,7]
 * 이것은 Union-Find 알고리즘을 활용하여
 * 서로 연결된 노드 집합을 구성하는 것과 같다
 *
 * 해결책
 * 1. Union-Find 알고리즘을 활용하여 각 배열의 번호를 노드로 보고 서로 연결된 집합을 만든다.
 *
 * 2. 주어진 배열의 부모값 데이터를 초기화 할때 같이 부모 노드의 자식 노드 개수를 저장하는 값도 추가한다
 *    => 초기 값은 각 노드에 개수는 1개 이다.
 *
 * 3. union 처리할때 두 노드의 부모를 찾아 작은 부모 노드로 합치는 과정에서
 *    1,2 => 경우 2의 부모를 1로 합치게 될때 1의 노드 개수는 1노드 개수 = 1개수+2개수, 1 = 1+1 = 2
 *    1의 노드 개수는 결국 2되도록 처리한다. 그리고 max 값을 두어 합치는 과정에서 부모노드 값을 반환하는 것이
 *    아니라 노드 연결 구성 처리 과정에서 현재까지 가장 큰 노드를 가진 그룹의 개수를 리턴 하도록 처리한다.
 *    주의 할점은 부모가 같은 경우는 처리되지 않도록 한다. (부모노드의 자식노드 개수가 중복으로 합산될 수 있기 때문)
 *
 * 4. 주어진 배열의 두 노드를 union 처리 할때 계산된 개별 부모 노드를 결과 배열에 차곡차곡 넣는다.
 *
 */
public class FriendCircleQueries {
    private static Map<Integer, Integer> parent = new HashMap<>();
    private static Map<Integer, Integer> size = new HashMap<>();
    private static int[] circles;
    private static int max = 0;

    private static int findParent(int node) {
        if (parent.get(node) == node) return node;
        parent.put(node, findParent(parent.get(node)));

        return parent.get(node);
    }

    private static int union(int node1, int node2) {
        int parent1 = findParent(node1);
        int parent2 = findParent(node2);

        if (parent1 < parent2) {
            parent.put(parent2, parent1);
            size.put(parent1, size.get(parent1) + size.get(parent2));
        } else if (parent1 > parent2) {
            parent.put(parent1, parent2);
            size.put(parent2, size.get(parent2) + size.get(parent1));
        }

        return max = Math.max(max, (parent1 < parent2) ? size.get(parent1) : size.get(parent2));
    }

    public static int[] maxCircle(int[][] queries) {
        circles = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            parent.put(queries[i][0], queries[i][0]);
            parent.put(queries[i][1], queries[i][1]);
            size.put(queries[i][0], 1);
            size.put(queries[i][1], 1);

        }

        for (int i = 0; i < queries.length ; i++) {
            circles[i] = union(queries[i][0], queries[i][1]);
        }

        return circles;
    }
}
