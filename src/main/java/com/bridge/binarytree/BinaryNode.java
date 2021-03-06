package com.bridge.binarytree;

public class BinaryNode<K> {

    K key;
    public BinaryNode<K> leftNode;
    public BinaryNode<K> rightNode;

    public BinaryNode(K key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    @Override
    public String toString() {
        return "MyBinaryNode{" +
                "key=" + key +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
