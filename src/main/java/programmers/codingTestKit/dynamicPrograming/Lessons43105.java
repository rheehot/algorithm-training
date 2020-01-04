package main.java.programmers.codingTestKit.dynamicPrograming;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43105
 * 정수 삼각형
 *
 * 트리탐색의 후위 탐색을 사용하여
 * 부모노드의 두 자식 중 큰 값과 자기 자신을 합산한 값을 저장 하여
 * 합산시 사용 하는 방법을 반복 하여 해결
 */
public class Lessons43105 {
    private static int[][] nodes;
    private static int[][] nodesSum;
    private static int ret = 0;

    public static int solution(int[][] triangle) {
        nodes = triangle;
        nodesSum = new int[triangle.length][triangle.length];
        search(0, 0);
        System.out.println(ret);
        return ret;
    }

    private static void search(int num1, int num2) {
        if (nodes.length == num1) return;
        if (nodesSum[num1][num2] > 0) return;

        search(num1 + 1, num2);
        search(num1 + 1, num2 + 1);
        nodesSum[num1][num2] = nodes[num1][num2] + (num1 < nodes.length - 1 ? Math.max(nodesSum[num1 + 1][num2], nodesSum[num1 + 1][num2 + 1]) : 0);
        ret = Math.max(ret, nodesSum[num1][num2]);
    }

}