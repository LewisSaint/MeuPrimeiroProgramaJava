package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import src.LinkedBinaryTree;

import src.LinkedBinaryTree;

import javax.swing.*;


class LinkedBinaryTreeTest {

    @Test
    void Test() {
        LinkedBinaryTree<String> Countries = new LinkedBinaryTree<String>();
        Countries.addRoot("Ásia");

        assertEquals("[Ásia]", Countries.toString());
    }
}