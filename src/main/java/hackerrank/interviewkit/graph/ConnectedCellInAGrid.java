package hackerrank.interviewkit.graph;

/**
 * https://www.hackerrank.com/challenges/ctci-connected-cell-in-a-grid/
 *
 * 그리드가 주어 지는데 상하좌우대각선으로 연결된 개수가 가장 큰 값을 찾는 문제 기본적으로 DFS 알고리즘을 사용
 * 즉 그래프로 보자면 연결된 노드의 수가 가장 큰 그래프의 노드 개수를 찾는 문제
 * 그래프는 하나의 노드에 연결된 노드정보가 같이 들어 오지만 이경우는 배열이라 상하좌우대각선으로 연결되어 있는지 매 번 체크 하는 부분이 추가 된다고 보면됨
 *
 * 1 1 0 0
 * 0 1 1 0
 * 0 0 1 0
 * 1 0 0 0
 *
 * 위 그리드에서 상하좌우대각선으로 연결된 영역은 5 개 짜리와 1개 짜리 임 5개를 출력
 *
 * 해결책
 *
 * 1. 기본 골격은 DFS알고리즘과 동일
 * 2. 그래프가 아닌 배열 정보 이므로 데이터를 초기화 할필요 없이 2차원 배열의 모든 포인트를 출발점으로 DFS 탐색턴
 * 3  상하좌우대각선 이동 정보를 가지는 배열을 생성 하여 상하좌우대각선 이동이 가능한지 체크 할 때 사용한다,
 * 4. DFS에서는 상하좌우대각선으로 갈 수 없거나 , 현재 배열의 포인트의 값이 0 이면 DFS 재귀 함수를 종료 0을 리턴한다.
 *    => 이동 가능하면 재귀적으로 DFS 탐색 한다.
 * 5. 방문여부는 따로 데이터를 구성하지 않고 입력 배열에 1값을 0으로 해버리면 이동 못하는 것이 되기 때문에 방문여부를 관리하는 것과 같은 효과
 * 6. DFS 탐색 후 노드 개수 중 가장 큰 값을 리턴한다.
 */
public class ConnectedCellInAGrid {
    // 입력값을 멤버 변수로 지정한다.
    private static int[][] grid;
    // 상화좌우대각선 이동 값
    private static int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {-1, 1}, {1, -1}, {1, 1}, {-1, -1}};

    public static int maxRegion(int[][] ints) {
        grid = ints;
        int maxCount = 0;

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                int dfs = dfs(x, y);
                maxCount = Math.max(maxCount, dfs);
            }
        }

        System.out.printf("max = " + maxCount);
        return maxCount;
    }

    // DFS
    private static int dfs(int x, int y) {
        if (immovable(x, y)) return 0;

        int count = 1;
        grid[x][y] = 0;

        for (int[] direction : directions) {
            int dfsCount = dfs( x + direction[0], y + direction[1]);
            count += dfsCount;
        }

        return count;
    }

    // 상하좌우대각선 이동 가능 불가능, 배열 포인트 값이 0 인지 확인 하여 이동 여부를 체크
    private static boolean immovable(int x, int y) {
        return x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0;
    }
}
