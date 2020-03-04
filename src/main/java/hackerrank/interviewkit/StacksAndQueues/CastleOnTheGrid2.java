package hackerrank.interviewkit.StacksAndQueues;

import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-03-02 4:28 오후
 */
public class CastleOnTheGrid2 {
    private static final int[][] NEXT_POINT = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static String[] matrix;
    private static int[][] visited;
    private static int xx = 0 , yy = 0;
    private static int count = 1;
    private static int min = Integer.MAX_VALUE;

    public static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        matrix = grid;
        visited = new int[grid.length][grid[0].length()];
        xx = goalX;
        yy = goalY;
        dfs(goalX, goalY,startX, startY);
        Arrays.stream(visited).forEach(v -> System.out.println(Arrays.toString(v)));
        return 0;
    }

    private static void dfs(int x, int y, int startX, int startY) {

        if (immovable(x, y, startX, startY)) return;

        visited[x][y] = 1;
        System.out.println(xx+", "+yy+" = "+x+", "+y+", cu = "+count);
        if (xx != x && yy != y) {
            xx = x;
            yy = y;
            count++;
        }

        if (x == startX && y == startY) {
            min = Math.min(min, count);
            System.out.println("min = "+min+", "+count);
            visited[x][y] = 0;
            return;
        }

        for (int[] nextPoint : NEXT_POINT) {
            dfs(x + nextPoint[0], y + nextPoint[1], startX, startY);
        }


    }

    private static boolean immovable(int x, int y, int startX, int startY) {
        return x < 0 || x >= matrix.length
                || y < 0 || y >= matrix.length
                || visited[x][y] > 0
                || matrix[x].charAt(y) == 'X';
    }


}
