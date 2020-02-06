package hackerrank.datastructure;

import hackerrank.datastructure.HuffmanDecoding;
import hackerrank.datastructure.huffman.Node;
import org.junit.Test;

public class HuffmanDecodingTest {

    @Test
    public void test() {
        //Given
        String item = "ABACA";
        String s = "1001011";
        int[] charFreqs = new int[256];

        // read each character and record the frequencies
        for (char c : item.toCharArray())
            charFreqs[c]++;

        // build tree
        Node tree = HuffmanDecoding.buildTree(charFreqs);

        //When

        HuffmanDecoding.decode(s, tree);
        //Then
    }

}