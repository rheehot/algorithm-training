package leetcode.topInterViewQuestions.medium.backTracking;

/**
 * Created by kimchanjung on 2020-02-24 1:43 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/797/
 * [Word Search]
 * 조금 꼬아 놓은 문제
 * 아래외 같은 배열이 주어 졌을 경
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * "ABCCED" A => 다음 B가 상,하,좌,우 인접한 곳에 있으면 계속 이어 나가서 ABCCED 위 배열에서 인접한 상,하,좌,우
 * 에 모두 위치 하면 true, 그렇지 않으면 false를 리턴한다.
 *
 * 해결책
 * 기본적으로 Number of Islands 문제외 매우 유사하다.
 * 1. 배열의 요소가 문자열 첫번째 요소왕 일치하면 DFS를 시작한다.
 * 2. 시작 지점에서 상하좌우를 확인하는데, 이동 가능하고, 다음 이어질 문자열과 같은 것이 있으면 계속 진행한다.
 * 4. 계속 해서 dfs를 수행 하여 모든 문자열이 이동가능한 지점에 일치하면 true 반환.
 */
public class WordSearch {

    private static int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // 첫번째 문자열과 일치 하면 시작 지점이다
                // dfs 결과가 true면 바로 리턴 하여 종료 하고
                // 그렇지 않으면 첫번째 문자가 배열의 다른 지점에 있는 경우도 체크한다.
                if (board[i][j] == word.charAt(0) && dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(int x, int y, int wordIndex, char[][] board, String word) {
        if (immovable(x, y, wordIndex, board, word)) return false;
        if (word.length() == wordIndex + 1) return true;
        board[x][y] = '#';

        for (int[] direction : directions) {
            // 4방향 가운데 일치하는 문자열이 있으면 바로 종료 한다.
            // 바로 종료 안해도 결국 immovable에서 걸려 지지만 수행 시간이 초가 된다.
            if (dfs(x + direction[0], y + direction[1], wordIndex + 1, board, word)) return true;
        }

        board[x][y] = word.charAt(wordIndex);

        return false;
    }


    private static boolean immovable(int x, int y, int wordIndex, char[][] board, String word) {
        return word.length() == wordIndex
                || x < 0 || y < 0
                || x >= board.length || y >= board[0].length
                || board[x][y] == '#' || board[x][y] != word.charAt(wordIndex);
    }
}
