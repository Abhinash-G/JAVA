package com.Tree.Easy;

import com.Tree.TreeNode;

public class Q543 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.right == null && root.left == null)
            return 0;
        else if (root.left == null)
            return (maxDepth(root.right) + 1);
        else if (root.right == null)
            return (maxDepth(root.left) + 1);
        else
            return (1 + Math.max(maxDepth(root.right), maxDepth(root.left)));
    }

    public int diameterThroughTheNode(TreeNode root, int currentMax) {
        if (root.right == null && root.left == null)
            return 0;
        else if (root.left == null) {
            int currentDiameter = Math.max((1 + maxDepth(root.right)), diameterThroughTheNode(root.right, currentMax));
            currentMax = Math.max(currentMax, currentDiameter);
            return currentMax;
        } else if (root.right == null) {
            int currentDiameter = Math.max((1 + maxDepth(root.left)), diameterThroughTheNode(root.left, currentMax));
            currentMax = Math.max(currentMax, currentDiameter);
            return currentMax;
        } else {
            return (2 + maxDepth(root.right) + maxDepth(root.left));
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root.right == null && root.left == null)
            return 0;
        return 0;//unfinnesed
    }
}