package main.java.hackerrank.datastructure;

import java.Node;

/**
 * 루트 노드(root node): 부모가 없는 노드, 트리는 하나의 루트 노드만을 가진다.
 * 단말 노드(leaf node): 자식이 없는 노드, ‘말단 노드’ 또는 ‘잎 노드’라고도 부른다.
 * 내부(internal) 노드: 단말 노드가 아닌 노드
 * 간선(edge): 노드를 연결하는 선 (link, branch 라고도 부름)
 * 형제(sibling): 같은 부모를 가지는 노드
 *
 * 간선(edge)의 수 : 노드 -1
 * 노드의 크기(size): 자신을 포함한 모든 자손 노드의 개수
 * 노드의 깊이(depth): 루트에서 어떤 노드에 도달하기 위해 거쳐야 하는 간선의 수
 * 노드의 레벨(level): 트리의 특정 깊이를 가지는 노드의 집합
 * 노드의 차수(degree): 특정 노드의 자식 수
 * 트리의 차수(degree of tree): 트리의 최대 차수
 * 트리의 높이(height): 루트 노드에서 가장 깊숙히 있는 노드의 깊이
 */
public class HeightOfABinaryTree {

    public static int height(Node root) {
        if (root == null) return -1;

        return 1+Math.max(height(root.left), height(root.right));

    }
}
