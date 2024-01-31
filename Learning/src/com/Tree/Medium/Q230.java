package com.Tree.Medium;

import com.Tree.TreeNode;

public class Q230 {
    private int kCopy;
    private int result;
    public int kthSmallest(TreeNode root, int k) {
        kCopy=k;
        inorderSearch(root);
        return result;
    }
    private void inorderSearch(TreeNode root){
        if(root==null)
            return;
        inorderSearch(root.right);
        --kCopy;
        if(kCopy==0)
            result=root.val;
        inorderSearch(root.left);
    }
}
