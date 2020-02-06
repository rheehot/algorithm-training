package hackerrank.datastructure;

import hackerrank.Node;
import hackerrank.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class LowestCommonAncestorTest {

    @Test
    public void test() {
        //Given
        int[] items = {4, 2, 3, 1, 7, 6};
        Node tree = TreeUtil.createTree(items);

        //When
        Node lca = LowestCommonAncestor.lca(tree, 1, 7);
        //Then

        assertEquals(4, lca.data);
    }

}