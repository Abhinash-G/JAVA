package com.LinkedList.Medium;

import com.LinkedList.Easy.Q206;
import com.LinkedList.ListNode;

import java.util.List;
import java.util.Stack;

public class Q143 {
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
        if(head.next==null){
            return;
        }
        else {
//            Two Pointer.
            {
                ListNode slow = head;
                ListNode fast = head;
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                }
                ListNode reversedList = reverse(slow.next);
                slow.next = null;
                ListNode frontList = head;
                while (frontList != null && reversedList != null) {
                    ListNode temp = frontList.next;
                    frontList.next = reversedList;
                    reversedList = reversedList.next;
                    frontList.next.next = temp;
                    frontList = temp;
                }
            }

//            Stack Implementation
           /* {
                Stack<ListNode> stack = new Stack<>();
                ListNode forStack = head;
                while (forStack != null) {
                    stack.push(forStack);
                    forStack = forStack.next;
                }
                ListNode headCopy = head;
                int length = stack.size();
                System.out.println("Length= " + length);
                int mid = length / 2;
                for (int i = 0; i < mid; i++) {
                    ListNode temp = headCopy.next;
                    headCopy.next = stack.pop();
                    headCopy = headCopy.next;
                    headCopy.next = temp;
                    headCopy = headCopy.next;
                }
                headCopy.next = null;
            }*/

        }
    }
}
