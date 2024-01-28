package com.LinkedList;

import java.lang.Object;
import com.Tree.TreeNode;

public class ListNode extends Object {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
