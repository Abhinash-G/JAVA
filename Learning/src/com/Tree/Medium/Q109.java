package com.Tree.Medium;

import com.LinkedList.ListNode;
import com.Tree.TreeNode;

public class Q109 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return new TreeNode(head.val);
        if(head.next.next==null)
            return new TreeNode(head.next.val,new TreeNode(head.val),null);
        if(head.next.next.next==null){
            TreeNode left=new TreeNode(head.val);
            TreeNode right=new TreeNode(head.next.next.val);
            TreeNode root=new TreeNode(head.next.val,left,right);
            return root;
        }
        else{
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode mid=slow.next;
            slow.next=null;
            ListNode right=head;
            ListNode left=mid.next;
            TreeNode root=new TreeNode(mid.val,sortedListToBST(right),sortedListToBST(left));
            return root;
        }

    }
}
