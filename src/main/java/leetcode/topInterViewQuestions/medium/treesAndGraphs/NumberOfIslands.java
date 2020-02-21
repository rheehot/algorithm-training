package leetcode.topInterViewQuestions.medium.treesAndGraphs;

/**
 * Created by kimchanjung on 2020-02-21 3:16 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/792/
 * [Number of Islands]
 * 아래 처럼 그리드가 주어진다.
 * 11000
 * 11000
 * 00100
 * 00011
 * 1 => 땅, 0 = 물
 *   1
 * 1 1 1 => 상,하,좌,우 가 서로 연결된 것으로 본다(대각선은 제외)
 *   1
 *
 * 저렇게 연결되어 있으면 1개의 섬으로 본다
 *    0
 *  0 1 0 => 상,하,좌,우 가 0 = 물 이면 오롯이 섬이 되는 것임
 *    0
 *
 * 11000
 * 11000
 * 00100
 * 00011
 *
 * 11
 * 11     => 1 개
 *    1   => 1 개
 *     11 => 1 개
 * 위 를 보면 각각 연결이 되어 있지않고 각각 1개식 총 3개 존재한다
 *
 * 1 이 각각 상,하,좌,우 의 방향으로 인접해 있지 않는 것들이 3개 이므로 (대각선도 연결된 것으로 보면 이야기는 달라진다)
 *
 * 해결 방법은
 *
 * 1. 각 그리드의 개별 요소를 하나의 노드로 보고 각 노드는 상,하,좌,우 4방향이 다음 노드가 된다. 1 이라면 이동 하고
 * 2. 이동한 노드에서 다시 상,하,좌,우 4방향 인접 노드를 탐색 한다.
 *
 * 3. 그래프로 보면
 *
 *  1  - 2
 *  |
 *  3
 *
 *  1의 연결 노드 2,3을 탐색
 *  2의 연결 노드 1,3을 탐색 (1은 이미 방문 제외)
 *  3의 연결 노드 1,2를 탐색 (1,2는 이미방문)
 *  처럼 일반적인 dfs를 이용한 그래프 탐색 기법과 동일하며
 *  본 문제에서는 현재 그리드의 노드에서 상,하,좌,우가 인접한 연결노드가 되는 것이다.
 *
 *  4. 2D 그리드의 모든 포인트의 4방향을 탐색, dfs 탐색 한다 연결된 섬이 1개 라면
 *     => dfs는 1을 리턴하고, 나머지가 0이라면 0을 리턴 한다
 *     => 반면 섬이 2개 라면 dfs가 탐색 하다가 섬이 종료 되었을 때 1을 리턴하고또 종
 *     => 점점 그리드의 포인트를 탐색 하다가 또다른 섬이 있다면 dfs가 1을 리턴하여 섬 개수에 합산된다.한
 *
 * 5. 이미 방문한 노드(그리드의 포인트)는 immovable 메소드에 있기 때문에
 *    사실 방문한 노드를 제외히는 코드는 메인 메소드의 2중 for 문에서 제외 하거나
 *    dfs의 4방향 탐색 시 제외 하거나 하는 것과 사실 같다.
 *
 */
public class NumberOfIslands {

    private static char[][] matrix;
    private static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static int numIslands(char[][] grid) {
        matrix = grid;
        int ret = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                 ret += dfs(i, j);
            }
        }

        return ret;
    }

    private static int dfs(int x, int y) {
        if (immovable(x, y)) return 0;

        matrix[x][y] = '0';

        for (int[] direction: directions) {
            dfs(x + direction[0], y + direction[1]);
        }

        return 1;
    }

    private static boolean immovable(int x, int y) {
        return x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] == '0';
    }
}
