package com.Tree.Medium;

import com.Tree.TreeNode;

import java.util.Arrays;
import java.util.HashMap;


public class Q106 {
//    private int binarySearch(int[] inorder,int key){
//        for(int i=0;i<inorder.length;i++){
//            if(inorder[i]==key)
//                return i;
//        }
//        return -1;
//    }
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        System.out.println(Arrays.toString(inorder));
        System.out.println(Arrays.toString(postorder));
        if(inorder.length==0)
            return null;
        if(inorder.length==1)
            return new TreeNode(inorder[0]);
        if(inorder.length==2){
            if(inorder[0]==postorder[0])
                return new TreeNode(postorder[1],new TreeNode(inorder[0]),null);
            else
                return new TreeNode(inorder[0],null,new TreeNode(postorder[0]));
        }
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int root= map.get(postorder[postorder.length-1]);
        return new TreeNode(inorder[root],buildTree(Arrays.copyOfRange(inorder,0,root),Arrays.copyOfRange(postorder,0,root)),buildTree(Arrays.copyOfRange(inorder,root+1,inorder.length),Arrays.copyOfRange(postorder,root,postorder.length-1)));
    }

    public static void main(String[] args) {
        Q106 ob=new Q106();
        ob.buildTree(new int[]{3,2,1},new int[]{3,2,1});
    }
}
