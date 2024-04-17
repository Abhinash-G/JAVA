package com.Tree.Medium;

import com.Tree.TreeNode;

public class Q1448 {
    private int count;
    private void countGoodNode(TreeNode root,int preMax){
        if(root==null)
            return;
        if(root.val>=preMax){
            ++count;
            preMax=root.val;
        }
        countGoodNode(root.left, preMax);
        countGoodNode(root.right, preMax);
    }
    public int goodNodes(TreeNode root) {
        count=1;
        if(root.left==null && root.right==null)
            return count;
        else if(root.left==null)
            countGoodNode(root.right,root.val);
        else if(root.right==null)
            countGoodNode(root.left, root.val);
        else{
            countGoodNode(root.left, root.val);
            countGoodNode(root.right, root.val);
        }
        return count;
    }
}
