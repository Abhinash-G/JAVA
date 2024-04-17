package com.Tree.Medium;

import com.Tree.TreeNode;

import java.util.*;

public class Q103 {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        map.put(0, new ArrayList<>(List.of(root.val)));
        levelTraversal(1, root.left);
        levelTraversal(1, root.right);
        return new ArrayList<>(map.values());
    }

    private void levelTraversal(int i, TreeNode root) {
        if (root == null)
            return;
        if (map.containsKey(i)) {
            if (i % 2 != 0)
                map.get(i).add(0, root.val);
            else map.get(i).add(root.val);
        } else
            map.put(i, new ArrayList<>(List.of(root.val)));
        levelTraversal(i + 1, root.left);
        levelTraversal(i + 1, root.right);
    }
}
