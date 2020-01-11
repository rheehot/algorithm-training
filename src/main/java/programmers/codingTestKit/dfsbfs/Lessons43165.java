package main.java.programmers.codingTestKit.dfsbfs;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43165
 * 코딩테스트 연습
 * 깊이/너비 우선 탐색(DFS/BFS)
 * 타겟 넘버
 *
 * 이문제는 dfs를 사용하는 문제인데
 * 일반적인 트리나 그래프를 입력값으로 주어지는 것이 아니라 처음에 어떤식으로 탐색해야하는지 혼란 스러웠다.
 *
 * 일반적으로 트리를 대상으로 하면 현재 노드의 자식노드들을 전부 탐색(재귀), => 조건은 이미 방문한 노드는 탐색하지 않는다.인데
 *
 * 1,2,3,4,5 라는 숫자를 어떤식으로 탐핵 해야 하는지 햇갈리게 되는 것
 *                     0
 *              +1           -1
 *          +2     -2      +2   -2
 *      +3   -3  +3   -3   ...
 *    .....
 * 사실 이런식으로 탐색 하게 되는 것인데 처음부터 노드를 만들어 구성할 필요는 없고
 *
 *  1. 0 부터 시작 하여  numbers의 다음 번호를 +합산한 값, -합산해내간 값들이 사실 자식 노드가 되는 것
 *  2. 계속해서 1번 자식 +2, -2 ... 이런식으로 나아가고 각 값은 계속 합산 하여
 *  3. 마지막 까지 탐색 했을 때 합산 된 값이 target 값과 같으면 1 아니면 0을 리턴하고 각각 값을 더해나가면
 *     최종적으로 target 값과 일치하는 케이스의 개수를 반환한다.
 */
public class Lessons43165 {
    public static int solution(int[] numbers, int target) {
        return dfs(0, 0, numbers, target);
    }

    private static int dfs(int index, int sum, int[] numbers, int target) {
        if (numbers.length == index ) return target == sum ? 1 : 0;
        return dfs(index + 1, sum + numbers[index], numbers, target) +
                dfs(index + 1, sum - numbers[index], numbers, target);
    }
}
