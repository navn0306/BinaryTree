package com.bridge.binarytree;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void givenNumbers_whenAddedToBST_shouldReturnSize() {
        BinaryTree myBinaryTree = new BinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        Assert.assertEquals(3,myBinaryTree.getSize());
    }
}