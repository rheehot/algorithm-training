package hackerrank.datastructure;

import hackerrank.Node;

/**
 * 이진 트리에서 특정 두 노드의 공통 부모를 찾는다
 * LCA 알고리즘 이라고 하는데 검색 해보면 모든 노드에 부모노드의 깊이를 파악해서 가지도록 전처리를 해두고
 * 두 노드의 공통 부모를 찾는 다고 해서 전처리를 하도록 하는데 해커랭크 이문제는 그럴 필요가 없는 문제 인건지 차이점을 모르겠다.
 *
 * 일단 이문제의 솔루션은
 *
 *           4
 *     2           7
 *  1     3    6
 *
 *
 *  1 , 7의 공통 부모는 4가 되는데
 *  1, 7이 4 보다 둘다 작으면 왼쪽, 둘다 크면 오른쪽으로 내려가는데 그게 아니라면 4를 중심으로 양쪽으로 흩어 졌다는 이야기가 됨으로 공통 부모는 4가 된다.
 *
 *  만약 1 ,3 의 공통 부모를 찾는다면
 *
 *  1, 3은 인단 4보다 둘다 작다 -> 왼쪽 자식으로 이동 -> 2 -> 1,3 은 2 보다 둘다 작거나 크지 않고 흩어 졌다 그러므로 공통조상은 2다
 *
 */
public class LowestCommonAncestor {
    public static Node lca(Node root, int v1, int v2) {

        while (root != null) {
            if (root.data > v1 && root.data > v2) {
                root = root.left;
            } else if (root.data < v1 && root.data < v2) {
                root = root.right;
            } else {
                return root;
            }
        }

        return root;
    }

}
