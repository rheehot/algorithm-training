package main.java.hackerrank.datastructure;

import apple.laf.JRSUIUtils;
import java.Node;
import java.TreeUtil;

/**
 * 이진 트리의 특정 레벨을 좌, 우 를 변경하는 것이 목표
 *
 * 주어진 값이 트리가 아니고 배열이다 그래서 좀 햇갈리는데
 *
 *  5 : 다음 라인의 5개가 노드들이라는 이야기
 *
 *  아래 데이터가 2차원 배열로 주어진다. 물론 root 1이고 그다음 부터 데이터 이다.
 *  첫번째 데이터는 (2, -1..) 왼쪽, 두번째 데이터(3,4..) 오른쪽 이다
 *
 *  그리고 중요한 것이 2의 자식은 배열에서 어딜까? 주어지는 법직이 데이터 값에 1을 뺀 수가 자식의 인덱스가 된다 즉
 *  2 - 1 = 1  -> 배열에서 1번 배열 에 있는 값 -1, 4 가 2의 자식 왼쪽 -1(null), 오른족 4가 된다
 *  3 - 1 = 2  -> 마찬 가지고 -1, 4가 된다
 *
 *
 *  2  3    index 0
 * -1  4    index 1 <-  2 - 1 = 1의 자리에 값이고 2의 자식이다.
 * -1  5    index 2
 * -1 -1    index 3
 * -1 -1    index 4
 *
 *  1 -> 쿼리의 개수
 *  2 -> 2는 2번째 레벨의 자식노드의 좌우를 변경한다. 이게 레벨이 0 또는 1 부터 시작하느냐에 따라 순서가 달라지니 조심!! 설명에서는 root가 level 1부터 시
 *
 *  트리로 표현하면
 *
 *        1
 *    2        3
 *
 *  null  4  null  5
 *
 *     null     null null
 *
 *        ||
 *
 *       1
 *   2        3
 *       4          5
 *
 *  가 된다
 *
 *  쿼리의 숫자가 2 인데 본문에서는 level 2 인 2, 3 의 자식의 좌우를 변경하라고 한다.
 *
 *          1
 *     2        3
 * 4       5
 *
 * 이런 경우 2, 3 이 레벨 2 라면 2의 좌, 우 변경인데. 2.left , 2.right 를 변경
 *
 * 레벨을 0 부터 시작하면 2, 3 이 레벨 1 이 되므로 레벨 1부터 시작 하는게 안햇갈린다.
 * 레벨 0 부터 시작한다면 쿼리 - 1 해서 해당 자식 좌우를 변경해야 할 것이다 무튼 레벨 1로 시작 하도록 코딩하자.
 *
 *
 * 그래서 솔루션은
 *
 * 1) 일단 주어진 노드의 배열을 2진 트리로 만들면서 노드의 레벨도 메겨 놓는다
 *    앞서 이야기 한 것 처럼 자식 노드는 배열에서 노드의 값 - 1 = index의 위치에 값이다.
 *    노드를 만드는 방식은 레벨 탐색과 비슷하게 1 레벨 만들고 자식 붙이고 자식에 자식 붙이고 -> 레벨 탐색 처럼 하나씩 생성한다.
 *    트리 만들째 자식이 부모보다 작으면 왼쪽 크면 오른쪽으로 보통 생성 하는 걸로 생각하면 안된다 주어진 배열의 버법칙이 그러해서 위 설명처럼 만든다.
 * 2) 만들어진 트리를 중위 순회 방법으로 (left -> root -> right) 순회 한다.
 * 3) 해당 노드를 순회 하면서 노드의 레벨과 -> 쿼리가 같으면 자식을 바꾸고 쿼리의 배수 즉 쿼리가 2면 2 -> 자식, 4-> 자식 ... 노드 끝 레벨까지
 *    좌우를 변경한다.
 *
 * 4) 3번까지가 완료이고 이 변경된 트리를 배열로 리턴 해야 해서 트리를 배열로 변경하는 처리를 한다.
 *
 */

public class SwapNodes {

    public static int count = 0;

    public static Node createTree(int data, int level, int[][] indexes) {

        Node node = new Node(data, level);

        int[] nodeValues = indexes[data - 1];

        if (nodeValues[0] != -1) {
            node.left = createTree(nodeValues[0], level + 1, indexes);
        }

        if (nodeValues[1] != -1) {
            node.right = createTree(nodeValues[1], level + 1, indexes);
        }

        return node;

    }

    public static Node swap(Node node, int query) {
        if (node == null) return null;


        // 설명이 햇갈리는데 쿼리에 해당하는 레벨의 자식만 변경하는 것이 아니고 배수에 해당하는 레벨이 자식도 모두 변경한다.
        // 쿼리가 2 이면 레벨 2의 자식 , 레벨 4의 자식 ... 끝까지 변경, 그래서 그래서 레벨에 쿼리를 나눈 나머지가 없는 레벨의 노드는 좌우 변
        if (node.level % query == 0) {
            System.out.println("level = " +node.level+", data = "+ TreeUtil.getData(node) +", query = "+query);
            Node right = node.right;
            node.right = node.left;
            node.left = right;
        }

        swap(node.left, query);
        swap(node.right, query);

        return node;
    }

    public static int[] inOrder(Node root, int[] result) {
        if (root == null) return null;

        inOrder(root.left, result);
        result[count++] = root.data;
        inOrder(root.right, result);

        return new int[0];
    }

    public static int[][] swapNodes(int[][] indexes, int[] queries) {

        int[][] result = new int[queries.length][indexes.length];

        Node node = createTree(1, 1, indexes);

        for (int i = 0; i < queries.length; i++) {
            swap(node, queries[i]);
            inOrder(node, result[i]);
            count = 0;
        }

        return result;
    }
}
