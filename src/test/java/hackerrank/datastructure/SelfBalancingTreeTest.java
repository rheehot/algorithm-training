package hackerrank.datastructure;

import hackerrank.datastructure.SelfBalancingTree;
import org.junit.Test;

public class SelfBalancingTreeTest {

    @Test
    public void test() {
        //Given
        SelfBalancingTree.Node root = new SelfBalancingTree.Node(5);
        root.left = new SelfBalancingTree.Node(2);
        root.right = new SelfBalancingTree.Node(4);
        root.right.right = new SelfBalancingTree.Node(5);

        //When
        SelfBalancingTree.Node node = SelfBalancingTree.insert(root, 6);

        SelfBalancingTree.printInOrder(node);

        System.out.println("d = "+ (-1 - 1));
        //Then
    }


    @Test
    public void 오른쪽회전이_정상적으로_수행된다() {
        //Given
        SelfBalancingTree.Node root = new SelfBalancingTree.Node(3);
        root.left = new SelfBalancingTree.Node(2);
        root.left.left = new SelfBalancingTree.Node(1);
        SelfBalancingTree.printInOrder(root);
        System.out.println("");

        //When
        SelfBalancingTree.Node node = SelfBalancingTree.rotateRight(root);
        SelfBalancingTree.printInOrder(node);
    }

}