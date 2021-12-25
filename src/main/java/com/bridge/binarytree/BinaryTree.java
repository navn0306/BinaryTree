package com.bridge.binarytree;

public class BinaryTree<K extends Comparable> {

    public BinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);

    }

    private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        else if (compareResult < 0)
            current.leftNode = addRecursively(current.leftNode, key);
        else {
            current.rightNode = addRecursively(current.rightNode, key);
        }
        return current;
    }

    public int getSize() {
        return this.getRecursive(root);
    }

    private int getRecursive(BinaryNode<K> current) {
        return 1 + this.getRecursive(current.leftNode) + this.getRecursive(current.rightNode);

    }

    public boolean isPresent(K value) {
        return search(root, value);
    }

    private boolean search(BinaryNode<K> root, K value) {
        if (root != null && root.key == value) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.key.compareTo(value) < 0) {
            return search(root.rightNode, value);
        } else {
            return search(root.leftNode, value);
        }

    }
}