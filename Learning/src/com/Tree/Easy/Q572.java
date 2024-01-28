package com.Tree.Easy;

import com.Tree.TreeNode;

public class Q572 {
    private String inorder(TreeNode root){
        if(root.left ==null && root.right == null)
            return Integer.toString(root.val);
        else if(root.left==null)
            return "null"+root.val+inorder(root.right);
        else if(root.right==null)
            return inorder(root.left)+root.val+"null";
        else
            return  inorder(root.left)+root.val+inorder(root.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootOrder=inorder(root);
        String subRootOrder=inorder(subRoot);
        if(rootOrder.contains(subRootOrder)){
            int start=0;
            while(rootOrder.indexOf(subRootOrder,start)!=-1){
                start=rootOrder.indexOf(subRootOrder,start);
                if(start==0 || (start+subRootOrder.length())==rootOrder.length())
                    return true;

            }
        }
        return false;
    }
}
