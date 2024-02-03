package com.Tree.Easy;

import com.Tree.TreeNode;

public class Q101 {
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null)
            return true;
        else if(root.left==null || root.right==null)
            return false;
        else if(root.right.val!=root.left.val)
            return false;
        else
            return checkMirror(root.left,root.right);
    }

    private boolean checkMirror(TreeNode left, TreeNode right) {
        if(left==null && right==null)
            return true;
        else if (left==null || right==null)
            return false;
        else if(left.val!=right.val)
            return false;
        else {
            return (checkMirror(left.left,right.right)) && (checkMirror(left.right,right.left));
        }
    }
}
