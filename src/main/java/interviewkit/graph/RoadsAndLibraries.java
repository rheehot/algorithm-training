package main.java.interviewkit.graph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/torque-and-development함
 * <p>
 * 도시가 있다 각 도시를 연결하는데 도로  비용, 도서관을 세우는 비용이 존재함
 * <p>
 * 도시가 연결되면 도서관은 1개만 지어도 됨
 * 도로 비용 + 도서관 1개 비용이, 도로연결하지 않고 각도시마다 도서관을 세우는 비용을 비교하여 싼 비용을 찾는다.
 */
public class RoadsAndLibraries {

    private static List<Integer>[] nodes;
    private static boolean[] visited;

    private static void init(int[][] cities, int n) {
        nodes = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        IntStream.range(0, nodes.length)
                .forEach(i -> nodes[i] = new ArrayList<>());

        for (int i = 0; i < cities.length; i++) {
            nodes[cities[i][0]].add(cities[i][1]);
            nodes[cities[i][1]].add(cities[i][0]);
        }
    }

    public static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        init(cities, n);
        long cost = 0;

        /**
         * 모든노드를 출발점으로 체크 하는 이유는
         * 1,2,3은 연결되어 있는데 4, 5는 지들 둘이만 연결되어 있어서 1,2,3 => 비용 계산, 4,5 비용 계산 후 합친다.
         * 그와중에 1 출발으로 탐색하고 2가 들어가면 중복인데 방문한 노드라 계에 포함되지 않도록 한다
         * 도시 그래프 상으로 1,2,3 / 5,4 개별로 연결되어 있는지는 알수 없기 때문에 이렇게 처리
         */
        for (int i = 1; i < nodes.length; i++) {

            int edgeCount = dfs(i);
            /**
             * 도시가 3개 있는 경우 도로비용 3, 도서관비용 2 인경우
             * 도서관 비용이 더싸다 그러면 2, 도시 3개 인경우 도로 2개만 연결하면됨(edgeCount - 1)
             * 도로 비용관(2) * 도서관비용(2) = 4 가됨 즉 2개 의 도시에 세우는 격이 되므로 + 도서관 비용 해주면
             * 결국 3 개의 도시에 그냥 도서관을 세우는 격이 됨
             *
             * 도시가 3개 있는 경우 도로비용 2, 도서관비용 3 인경우
             * 도시(2) * 도로비용 = 4 가 됨 => 도시 3개를 도로 2개로 연결시킴
             * 도시(2) * 도로비용 = 4 + 도서관비용(3) => 결국 도로 2개로 도시를 연결하고 도서관은 1개만 지으면 되는 것
             *
             */
            if (edgeCount > 0) cost += c_lib + (edgeCount - 1) * Math.min(c_lib, c_road);
        }

        return cost;
    }

    private static int dfs(int node) {
        if (visited[node]) return 0;
        visited[node] = true;
        int count = 1;

        for (int subNode : nodes[node]) {
            count += dfs(subNode);
        }

        return count;
    }

    private static int dfsByStack(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        int count = 0;

        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            if (visited[node]) continue;
            visited[node] = true;
            count++;

            for (int i = nodes[node].size() - 1; i >= 0; i--) {
                int subNode = nodes[node].get(i);
                if (!visited[subNode]) {
                    stack.push(subNode);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        String path = Paths.get("").toAbsolutePath().toString()+"/src/testcase-file/";
        BufferedReader br = new BufferedReader(new FileReader(path+"roads-and-libraries.txt"));

        String s = br.readLine();
        System.out.println("q = " + s);
        for (int qItr = 0; qItr < Integer.parseInt(s); qItr++) {
            String[] nmC_libC_road = br.readLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = br.readLine().split(" ");
                br.skip(0);
                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = roadsAndLibraries(n, c_lib, c_road, cities);

            System.out.println("result = " + result);
        }

        br.close();
    }

}
