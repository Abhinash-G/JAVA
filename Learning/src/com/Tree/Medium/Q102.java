package com.Tree.Medium;
import com.Tree.TreeNode;

import java.util.*;

public class Q102 {
    HashMap<Integer,ArrayList<Integer>> map;
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        if(root.right==null && root.left==null)
            return new ArrayList<>(List.of(new ArrayList<>(List.of(root.val))));
        List<List<Integer>> result=new ArrayList<>();
        levelOrderRecursion(result,0,root);
        return result;
////        levelOrderRecursion(0, root);
//         map = new HashMap<>();
////        {
////            Queue<TreeNode> queue = new LinkedList<TreeNode>();
////            queue.add(root);
////            int level = 0;
////            while (!queue.isEmpty()) {
////                TreeNode tempNode = queue.poll();
////                if (map.containsKey(level))
////                    map.get(level).add(root.val);
////                else
////                    map.put(level, new ArrayList<>(List.of(tempNode.val)));
////                if (tempNode.left == null && tempNode.right == null)
////                    --level;
////                else {
////                    ++level;
////                    if (tempNode.left != null) {
////                        queue.add(tempNode.left);
////                    }
////                    if (tempNode.right != null) {
////                        queue.add(tempNode.right);
////                    }
////                }
////            }
////        }
//        return new ArrayList<>(map.values());
    }

    private void levelOrderRecursion(List<List<Integer>> result, int i, TreeNode root) {
        if(root==null)
            return;
        if(result.size()>=i)
            result.get(i).add(root.val);
        else
            result.add(new ArrayList<>(List.of(root.val)));
        levelOrderRecursion(result,i + 1, root.left);
        levelOrderRecursion(result,i + 1, root.right);
    }
//    private void levelOrderRecursion(List<List<Integer>> result, int i, TreeNode root) {
//        if(map.containsKey(i))
//            map.get(i).add(root.val);
//        else
//            map.put(i,new ArrayList<>(List.of(root.val)));
//        if(root.right==null && root.left==null)
//            return;
//        if(root.left==null)
//            levelOrderRecursion(++i,root.right);
//        else if(root.right==null)
//            levelOrderRecursion(++i,root.left);
//        else {
//            levelOrderRecursion(i + 1, root.left);
//            levelOrderRecursion(i + 1, root.right);
//        }
//    }
}
