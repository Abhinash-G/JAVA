package com.Tree.Easy;

import com.Tree.TreeNode;

public class Q2331 {
    /*
    You are given the root of a full binary tree with the following properties:
    Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
    Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.*/
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null)
            return (root.val==1);
        if(root.val==2)
            return evaluateTree(root.left) || evaluateTree(root.right);
        else
            return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
