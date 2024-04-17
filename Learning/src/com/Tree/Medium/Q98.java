package com.Tree.Medium;

import com.Tree.TreeNode;


public class Q98 {
    public boolean isValidBST(TreeNode root) {
        if(root.right==null && root.left==null)
            return true;
        if(root.right==null)
            return toLeft(root.left,root.val);
        if(root.left==null)
            return toRight(root.right,root.val);
        else
            return toLeft(root.left,root.val) && toRight(root.right,root.val);
    }

    private boolean toLeft(TreeNode root,int max){
        if(root.right==null && root.left==null)
            return root.val<max;
        if(root.right==null)
            return root.val<max && toLeft(root.left,root.val);
        if(root.left==null)
            return root.val<max && leftToRight(root.right,root.val,max);
        else
            return root.val<max && toLeft(root.left,root.val) && leftToRight(root.right,root.val,max);
    }

    private boolean leftToRight(TreeNode root, int min, int max) {
        if(root.right==null && root.left==null)
            return (min< root.val && root.val<max);
        if(root.right==null)
            return (min< root.val && root.val<max)  && rightToLeft(root.left,min, root.val);
        if(root.left==null)
            return (min< root.val && root.val<max) && leftToRight(root.right,root.val,max);
        else
            return (min< root.val && root.val<max) && leftToRight(root.right,root.val,max) && rightToLeft(root.left,min, root.val);
    }

    private boolean toRight(TreeNode root,int min){
        if(root.right==null && root.left==null)
            return root.val>min;
        if(root.left==null)
           return root.val>min && toRight(root.right,root.val);
        if(root.right==null)
            return root.val>min && rightToLeft(root.left,min,root.val);
        else
            return root.val>min && rightToLeft(root.left,min,root.val) && toRight(root.right,root.val);
    }

    private boolean rightToLeft(TreeNode root, int min, int max) {
        if(root.right==null && root.left==null)
            return (min< root.val && root.val<max);
        if(root.right==null)
           return (min< root.val && root.val<max) && rightToLeft(root.left,min, root.val);
        if(root.left==null)
           return (min< root.val && root.val<max) && leftToRight(root.right,root.val,max);
        else
           return (min< root.val && root.val<max) && leftToRight(root.right,root.val,max) && rightToLeft(root.left,min, root.val);
    }

    public static void main(String[] args) {
        TreeNode r11=new TreeNode(1);
        TreeNode r21=new TreeNode(3);
        TreeNode r22=new TreeNode(6);
        TreeNode r12=new TreeNode(4,r21,r22);
        TreeNode r=new TreeNode(5,r11,r12);
        Q98 ob=new Q98();
        System.out.println(ob.isValidBST(r));

    }
}
