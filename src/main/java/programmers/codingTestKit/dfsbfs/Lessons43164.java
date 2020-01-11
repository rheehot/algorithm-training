package main.java.programmers.codingTestKit.dfsbfs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-10 6:06 오후
 * https://programmers.co.kr/learn/courses/30/lessons/43164
 *
 * 문제가 기가막힌다. 조건이 애매하여
 * 실패의 경우 숨은 테스트 케이스라 디버깅을 할 수가 없음....
 */
public class Lessons43164 {

    private static String[][] nodes;
    private static boolean[] visited;
    private static List<String> direction = new ArrayList();

    public static String[] solution(String[][] tickets) {
        nodes = tickets;
        visited = new boolean[nodes.length];

        IntStream.range(0, nodes.length)
                .filter(i -> nodes[i][0].equals("ICN"))
                .forEach(i ->  dfs(i, nodes[i][0] + "," + nodes[i][1], 0));

        return direction.stream()
                .sorted()
                .collect(Collectors.toList())
                .get(0).split(",");
    }

    private static void dfs(int idx, String str, int cnt) {
        if (visited[idx]) return;
        if (nodes.length - 1 == cnt){
            direction.add(str);
            return;
        }

        visited[idx] = true;

        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i][0].equals(nodes[idx][1])) {
                dfs(i, str+"," + nodes[i][1], cnt + 1);
            }
        }

        visited[idx] = false;

    }

}
