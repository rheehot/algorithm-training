package basicAlgorithms.treeAndGraph;

import basicAlgorithms.treeAndGraph.KruskalAlgorithms;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KruskalAlgorithmsTest {

    @Test
    public void test() {

        List<KruskalAlgorithms.Edge> edgeList = new ArrayList<>();
        edgeList.add(new KruskalAlgorithms.Edge(2,1,8));
        edgeList.add(new KruskalAlgorithms.Edge(1,0,5));
        edgeList.add(new KruskalAlgorithms.Edge(2,4,5));
        edgeList.add(new KruskalAlgorithms.Edge(1,3,4));

        KruskalAlgorithms.findShortest(edgeList);
    }
}