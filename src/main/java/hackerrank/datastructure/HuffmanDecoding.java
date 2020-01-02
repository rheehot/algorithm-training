package main.java.hackerrank.datastructure;


import main.java.hackerrank.datastructure.huffman.HuffmanLeaf;
import main.java.hackerrank.datastructure.huffman.HuffmanNode;
import main.java.hackerrank.datastructure.huffman.Node;

import java.util.PriorityQueue;


/**
 * 허프만 디코딩
 *
 * 허프만 인코딩을 이해 해야 하는데 일단 문제 해결을 위하여 주어진 값을 설명하자면
 * s = 1001011 <- 인코딩 된 값 이며 1은 오른쪽 노드로, 0은 왼쪽 노드를 가리킨다
 *
 * tree는 아래 처럼 구성 되어 있고  앞의 값은 데이터 이고 다음 숫자는 빈도수를 나타낸다
 *
 *              null, 5
 *          null, 2     A, 3
 *      B, 1     C, 1
 *
 * 디코딩에서는 빈도수를 사용하지 않는데. 인코딩 시 빈도수는 A, 3 은 A가 3개 있다는 말이다
 * 이 정보를 바탕으로 s = 1001011 처럼 인코딩 코드로 만들어 지며 이 코드를 가지고 트리를 탐색하며 데이터를 찾아내어 디코딩 하는 것이 목표
 *
 * 순서는
 *
 * 1) s = 1001011 -> 각 숫자를 루프 돌면서 0 이면 왼쪽, 1이면 오른쪽 자식 노드로 간다. ex) 1  => root -> A
 * 2) 이동한 노드가 자식이 없다면 값을 출력 하고 -> 다시 root로 간다 ex) A 는 자식이 없으므로 A 값을 출력 대상으로 하고 -> root로 이동
 * 3) s = 0 이므로 root의 왼쪽 자식으로 -> 자식이 있다 -> 다음 s = 0 이므로 다시 왼쪽 자식으로 가고 B 출력, 자식 없으므로 root로 ex) root -> null -> B 출
 * 4) s = 1 이므로 1~2을 반복 ex) root -> A
 * 5) s = 0 이므로 왼쪽 -> null 자식이 있고 다음 s = 1 므로 오른쪽 자식 -> C -> 자식 없다 -> 출력하고 root로. ex) root -> null -> C , root로
 * 6) s = 1 이므로 1~2을 반복 ex) root -> A
 *
 * 최종 디코딩 된 문자는 ABACA
 */

public class HuffmanDecoding {

    public static Node buildTree(int[] charFreqs) {

        PriorityQueue<Node> trees = new PriorityQueue<Node>();
        // initially, we have a forest of leaves
        // one for each non-empty character
        for (int i = 0; i < charFreqs.length; i++)
            if (charFreqs[i] > 0)
                trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));

        assert trees.size() > 0;

        while (trees.size() > 1) {
            // two trees with least frequency
            Node a = trees.poll();
            Node b = trees.poll();


            trees.offer(new HuffmanNode(a, b));
        }

        return trees.poll();
    }

    public static void decode(String s, Node root) {
        StringBuilder decodeString = new StringBuilder();
        Node node = root;

        // 디코딩 문자열을 하나씩 루프를 돈다
        for (int i = 0; i < s.length() ; i++) {
            // 1이면 노드의 오른쪽, 0이면 된쪽 자식 노드로 이동 시킨다.
            node = s.charAt(i) == '1' ? node.right : node.left;

            // 이동된 자식 노드에 자식이 없다면 값을 출력할 값이다
            if (node.left == null && node.right == null) {
                //출력할 값을 넣어준다
                decodeString.append(node.data);
                // 자식이 없는 노드 이므로 다시 root 노드로 간다.
                node = root;
            }
        }

        System.out.println(decodeString);
    }

}
