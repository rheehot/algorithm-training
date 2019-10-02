package main.java.datastructure;

import main.java.Node;
import main.java.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopViewTest {

    @Test
    public void test() {
        //Given
        int[] items = {1, 14, 3, 7, 4, 5, 15, 6, 13, 10, 11, 2, 12, 8, 9};
        Node root = TreeUtil.createTree(items);

        //When
        TopView.topView(root);
    }

}