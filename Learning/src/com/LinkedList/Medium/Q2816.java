package com.LinkedList.Medium;

import com.LinkedList.ListNode;

import java.util.Stack;

public class Q2816 {
    //First and easy approach
    {
//    public ListNode doubleIt(ListNode head) {
//        Stack<ListNode> stack=new Stack<>();
//        ListNode copyOfHead=head;
//        while(head!=null) {
//            stack.push(head);
//            head=head.next;
//        }
//        int reminder=0;
//        ListNode temp=null;
//        while(!stack.isEmpty()){
//            temp=stack.pop();
//            reminder=(temp.val*2)+reminder;
//            temp.val=reminder%10;
//            reminder=reminder/10;
//        }
//        while (reminder!=0){
//            ListNode newNode=new ListNode(reminder%10,temp);
//            temp=newNode;
//            reminder/=10;
//        }
//        return temp;
//    }
    }
    //Reverse approach
    {
//        public ListNode doubleIt (ListNode head){
//        ListNode prevNode = head;
//        ListNode currentNode = head.next;
//        //reverse
//        while (currentNode != null) {
//            ListNode nextNode = currentNode.next;
//            currentNode.next = prevNode;
//            prevNode = currentNode;
//            currentNode = nextNode;
//        }
//        head.next = null;
//        head = prevNode;
//
//        prevNode = null;
//        currentNode = head;
//        int reminder = 0;
//        while (currentNode != null) {
//            reminder = (currentNode.val * 2) + reminder;
//            currentNode.val = reminder % 10;
//            reminder = reminder / 10;
//            ListNode temp = currentNode.next;
//            currentNode.next = prevNode;
//            prevNode = currentNode;
//            currentNode = temp;
//        }
//        if (reminder != 0)
//            prevNode = new ListNode(reminder % 10, prevNode);
//        return prevNode;
//    }
    }
    //Best according to the Question.
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        int frem = 0;

        if (temp != null && temp.val >= 5) {
            frem = 1;
        }
        while (temp != null && temp.next != null) {
            int value1=temp.val;
            if (temp.next.val >= 5) {
                int result = value1 * 2 + 1;
                int lastDigit = result % 10;
                temp.val = lastDigit;
            } else {
                int result = value1 * 2;
                int lastDigit = result % 10;
                temp.val = lastDigit;
            }
            temp = temp.next;
        }
        if (temp != null) {
            temp.val = (temp.val * 2) % 10;
        }
        if (frem == 1) {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }
//    private void print(ListNode cur) {
//        while (cur != null) {
//            System.out.print(cur.val + " ");
//            cur = cur.next;
//        }
//        System.out.println();
//    }
}
