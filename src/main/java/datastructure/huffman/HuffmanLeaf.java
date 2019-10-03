package main.java.datastructure.huffman;

public class HuffmanLeaf extends Node {

    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
}