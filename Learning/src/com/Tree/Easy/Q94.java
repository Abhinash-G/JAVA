package com.Tree.Easy;

import com.Tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (root.left != null) {
            for (int i : inorderTraversal(root.left)) {
                result.add(i);
            }
        }
        result.add(root.val);
        if (root.right != null) {
            for (int i : inorderTraversal(root.right)) {
                result.add(i);
            }
        }
        return result;

//        {
//            Stack<TreeNode> st = new Stack<>();
//            List<Integer> ans = new ArrayList<>();
//            TreeNode temp = root;
//
//            while (true) {
//                if (temp != null) {
//                    st.push(temp);
//                    temp = temp.left;
//                } else {
//                    if (st.isEmpty()) {
//                        break;
//                    }
//                    temp = st.pop();
//                    ans.add(temp.val);
//                    temp = temp.right;
//                }
//            }
//            return ans;
//
//        }
    }
}
