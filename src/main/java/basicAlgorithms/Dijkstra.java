package basicAlgorithms;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra {

    static int[] shortDistance = {100000, 100000, 100000, 100000, 100000, 100000};

    public static class NodeInfo implements Comparable<NodeInfo> {
        private int nodeNum;
        private int distance;

        public NodeInfo(int nodeNum, int distance) {
            this.nodeNum = nodeNum;
            this.distance = distance;
        }

        public int getNodeNum() {
            return nodeNum;
        }

        public int getDistance() {
            return distance;
        }

        @Override
        public int compareTo(NodeInfo o) {
            return this.distance - o.distance;
        }
    }


    public static int shortPath(int[][] nodeData, int start, int dest) {
        System.out.println("start = " + start + ", dest = " + dest);
        PriorityQueue<NodeInfo> pq = new PriorityQueue<>();
        shortDistance[start] = 0;
        pq.offer(new NodeInfo(start, 0));

        while (!pq.isEmpty()) {
            // 시작 노드의 연결된 노드 중에 가장 가까운 노드를 꺼낸다
            // 꺼내온 노드를 기준으로 연결된 노드들을 전부 확인 하기 위함이다
            // 즉 1 에서 각노드들로 가는 비용과 1에서 가장 가까운 노드 2에서 각 노드들로 가는 비용을 비교 하는 것 즉
            // 1 -> 각노드 비용  VS 1 -> 특정노드 -> 각노드 비용을 판별하여 비용이 적게 들면 업데이트
            NodeInfo nearestNode = pq.poll();
            int nearestNodeDistance = nearestNode.getDistance();
            int nearestNodeNodeNum = nearestNode.getNodeNum();

            // 현재 특정 노드로 가는 최소 비용 원래 비용 보다 크다면 비용을 줄일 수 있다
            // 1 -> 각노드 비용  VS 1 -> 특정노드 -> 각노드 비용을 판별하여 비용이 적게 들면 업데이트 작업을 수행하고
            // 그렇지 않으면 최소비용이 되었으므로 판별 작업을 하지 않는다.
            if (shortDistance[nearestNodeNodeNum] < nearestNodeDistance)
                continue;

            // 거처갈 노드에서 각노드를 전부 확인한다.
            // 즉 현재 (1 -> 특정노드) 최소비용 VS (1 -> 거쳐갈노드 + 거쳐갈노드 -> 특정노드 = 비용 (1 -> 거쳐갈노드 -> 특정노드 = 비용이됨)
            for (int i = 0; i < nodeData[nearestNodeNodeNum].length; i++) {
                int byPassDistance = shortDistance[nearestNodeNodeNum] + nodeData[nearestNodeNodeNum][i];
                // 거쳐가는 비용이 적다면 적은 비용을 발견하였으므로
                // 최소비용 데이터를 업데이트 하고, 이 업데이트 된 노드는 또다른 노드를 거쳐가는 비용이 더 싼 경우가 있을 것이므로 판별 대상에 넣기 위해서
                // 큐에 넣는다.
                if (byPassDistance < shortDistance[i] ) {
                    shortDistance[i] = byPassDistance;
                    pq.offer(new NodeInfo(i, byPassDistance));
                }

            }


        }

        Arrays.stream(shortDistance).forEach(v -> System.out.printf(v+", "));
        System.out.println("dist = " + shortDistance[dest]);
        return shortDistance[dest];

    }
}
