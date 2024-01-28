package com.Tree.Easy;

import com.Tree.TreeNode;

public class Q100 {
//    private String preOrder(TreeNode node){
//        if(node==null)
//            return "null";
//        else if(node.left==null && node.right==null)
//            return Integer.toString(node.val);
//        else{
//            return (Integer.toString(node.val)+","+preOrder(node.left)+","+preOrder(node.right));
//        }
//    }
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        return preOrder(p).equals(preOrder(q));
//    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p.val!=q.val)
            return false;
        else
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
