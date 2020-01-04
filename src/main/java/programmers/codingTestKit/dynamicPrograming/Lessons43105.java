package main.java.programmers.codingTestKit.dynamicPrograming;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43105
 * 정수 삼각형
 * <p>
 * 트리탐색의 후위 탐색을 사용하여
 * 부모노드의 두 자식 중 큰 값과 자기 자신을 합산한 값을 저장 하여
 * 합산시 사용 하는 방법을 반복 하여 해결
 */
public class Lessons43105 {
    private static int[][] nodes;
    private static int[][] nodesSum;

    public static int solution(int[][] triangle) {
        nodes = triangle;
        nodesSum = new int[triangle.length][triangle.length];
        return preOrder(0, 0);
    }

    private static int preOrder(int row, int col) {
        if (nodes.length == row) return 0;
        if (nodesSum[row][col] > 0) return nodesSum[row][col];
        return nodesSum[row][col] = nodes[row][col] + Math.max(preOrder(row + 1, col), preOrder(row + 1, col + 1));
    }

}