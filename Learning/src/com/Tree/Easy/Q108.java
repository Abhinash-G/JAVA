package com.Tree.Easy;

import com.Tree.TreeNode;

import java.util.Arrays;

public class Q108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==1)
            return new TreeNode(nums[0]);
        else if(nums.length==2){
            TreeNode left=new TreeNode(nums[0]);
            TreeNode root=new TreeNode(nums[1],left,null);
            return root;
        }
        else if(nums.length==3){
            TreeNode left=new TreeNode(nums[0]);
            TreeNode right=new TreeNode(nums[2]);
            TreeNode root=new TreeNode(nums[1],left,right);
            return root;
        }
        else {
            int mid=nums.length/2;
            TreeNode left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
            TreeNode right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
            TreeNode root=new TreeNode(nums[mid],left,right);
            return root;
        }
    }
}
