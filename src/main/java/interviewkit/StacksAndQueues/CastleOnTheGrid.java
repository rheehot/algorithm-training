package main.java.interviewkit.StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/castle-on-the-grid
 * BFS 넓이 우선 탐색 알고리즘을 이용한다.
 * 현재 노드에서 연결된 노드가 있다면 큐에 넣는다
 * 큐에 들어간 노드를 꺼내어 그 노드에 연결된 노드가 있다면 다시 큐에 넣는다.
 * 기본적으로 BFS 알고리즘을 이용하여 이동 경로를 찾아 내는 방법을 사용한다.
 *
 * 주어진 문제는
 * ...
 * .X.
 * ...
 *
 * . 은 이동가능 X는 이동 불가능이다
 * 위 텍스트로 2차원 배열로 구성하면 아래와 같이 구성된다
 *
 * 0,0 0,1 0,2
 * 1,0 1,1 1,2
 * 2,0 2,1 2,2
 *
 * 해당하는 포인트에 초기값을 -1로 해두어 이동여부 밑 이동 회수를 카운트 하기위한 용도로 사용한다,
 *
 * 일단 트리저럼 노드가 이미 연결된 것이 아니기 때문에
 * 상하 좌우 4 방향으로 다음 포인터가 연결되어 있다고 보기 때문에
 * 상하 좌우 이동 값을 준비한다
 * NEXT_POINT = {{-1, 0},
 *             {1, 0},
 *             {0, -1},
 *             {0, 1}};
 *
 * 포인터 좌표에 위 값을 + 계산하면 상하좌우 포인터가 된다 이값을 가지고 상하좌우 포인트를 이동시킨다.
 *
 * 1. 시작 포인터 위치 값을 0으로 초기화 하고 큐에 넣는다 출발 점이 되고 이제 이 추발점에서 X가 아닌 이동가능한 4방향을 이동 가능 할때 까지 탐색한다.
 * 2. 4방향을 탐색 하면서 다음 탐색을 위해 탐색된 포인트들을 큐에 넣는다. -> 큐에 들어간 포인터들은 다시 그 포인터를 출발점으로 이동가능한 포인터들을 찾고 큐에 넣는 것을 반복한다.
 * 3. 이렇게 해서 연결된(이동가능한) 경로를 찾게 되는데 주의 할점은 모든 연결점을 찾으면 타임아웃 나니 이동경로를 찾아가다가 목표점과 같은 경로가 나오면
 *    바로 리턴하여 다음 로직은 수행 하지 않도록 해야한다,
 */
public class CastleOnTheGrid {
    static final int[][] NEXT_POINT = {{-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}};

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int minimumMoves(String[] grid, int startX, int startY, int goalX, int goalY) {
        // 2차원 배열에서 각 방문한 위치에 방문 여부와 이동 비용을 저장하기 위한용도
        int[][] visitedPoint = new int[grid.length][grid.length];
        // 방문 위치 값을 -1로 채워서 아직 방문하지 않은 상태로 초기화 한다(방문 했을 경우 해당하는 비용이 저장된다)
        IntStream.range(0, grid.length).forEach(x -> Arrays.fill(visitedPoint[x], -1));
        // 시작 위치의 초기 0을 저장한다 -1 이 아니기 때문에 값도 가지고 있고 추후 탐색시 이미 방분한 포인트는 처리하지 않기위한 값으로도 활용된다.
        visitedPoint[startX][startY] = 0;
        // BFS 탐색에서 해당 포인트의 연결(이동가능한)된 포인트들을 탐색하기위해서 큐에 담게 되는 용도로 사용한다.
        Queue<Point> queue = new LinkedList<>();
        // 시작 지점을 큐에 담는다.
        queue.offer(new Point(startX, startY));

        while (true) {
            // 탐색할 포인트를 꺼내온다.
            Point point = queue.poll();

            /**
             *  탐색할 포인트에서 연결된 포인들 즉 상 하 좌 우 4가지 방향으로 탐색을 한다.
             *       2,3
             *  3,2  3,3  3,4
             *       4,3
             *
             * 이렇게 되는데 즉  상(-1, 0), 하(1, 0), 좌(0, -1), 우(0 , 1) 이동 값을 가지고 3,3 에 각각 값을 + 계산 해주면
             *
             * 상하좌우 포인트의 좌표가 생성되는 것

             */

            for (int i = 0; i < NEXT_POINT.length; i++) {
                int pointX = point.x;
                int pointY = point.y;

                // 현재 포인트에서 4방향을 검사하는데 갈수 있는 포인트인지 판별한다.
                while (moveAbleNextPoint(grid, pointX + NEXT_POINT[i][0], pointY + NEXT_POINT[i][1])) {
                    // 포인터에 상화 좌우 방향 값을 더해 줬기 때문에 이동 가능한 다음 포인트 값이 된다. 즉 다음 포인터로 이동 했다는 뜻
                    // 상하좌우 이동 할때 이동 가능하다면 즉 1칸씩 갈 수 있을 때까지 이동한다
                    // 예를 들어 아래 방향 이라면 이동 가능 할때 까지 1 -> 2 -> 3 한칸식 이동한
                    pointX += NEXT_POINT[i][0];
                    pointY += NEXT_POINT[i][1];

                    // 현재 포인터와 도착점 포인터가 일치하면 반환
                    if (pointX == goalX && pointY == goalY) {
                        return visitedPoint[point.x][point.y] + 1;
                    }

                    // 이동가능한 상하 좌우 포인터가 이미 방문한 곳이 아니라면
                    // 값을 저장하는데 큐에 담겨 있던 포인터 즉 해당 포인터에서 모든 방향으로 탐색을 하기 때문에
                    // 그 포인터가 3이라고 한다면 아래로 4, 5, 6 이 전부 이동가능하다면 원래 3의 값에서 +1 만 해준다
                    // 이유는 3 -> 4 -> 5 -> 6 이동할 때마다 비용이 1씩 증가하는 것이 아니라 연결되어 있기 때문에 비용은 1로 보기 때문이다.
                    if (visitedPoint[pointX][pointY] < 0) {
                        visitedPoint[pointX][pointY] = visitedPoint[point.x][point.y] + 1;
                        System.out.println(pointX+", "+pointY+" = "+visitedPoint[pointX][pointY]);
                        queue.offer(new Point(pointX, pointY));
                    }
                }
                System.out.println();
            }
        }
    }

    static boolean moveAbleNextPoint(String[] grid, int nextX, int nextY) {
        return nextX >= 0 && nextX < grid.length && nextY >= 0 && nextY < grid.length && grid[nextX].charAt(nextY) == '.';
    }
}
