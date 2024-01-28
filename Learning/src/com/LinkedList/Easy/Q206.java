package com.LinkedList.Easy;

import com.LinkedList.ListNode;

import java.util.List;
import java.util.Stack;

public class Q206 {

    public ListNode reverseList(ListNode head) {
//        iterative method.
//        {
//        if (head == null || head.next == null)
//            return head;
//        ListNode result = new ListNode(head.val, null);
//        while (head.next != null) {
//            head = head.next;
//            ListNode temp = new ListNode(head.val, result);
//            result = temp;
//        }
//        return result;
//    }

//
        {
            Stack<Integer> stack=new Stack<>();
            while(head!=null) {
                stack.push(head.val);
                head = head.next;
            }
            ListNode result = new ListNode();
            head=result;
                while(!stack.isEmpty()){
                    result.next= new ListNode(stack.pop());
                    result=result.next;
                }
                return head.next;

        }
    }
}
