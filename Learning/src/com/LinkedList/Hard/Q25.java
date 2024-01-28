package com.LinkedList.Hard;

import com.LinkedList.ListNode;

public class Q25 {
    private static ListNode[] reverse(ListNode head){
        if(head==null || head.next==null)
            return new ListNode[]{head,head};
        ListNode result=reverse(head.next)[0];
        head.next.next=head;
        ListNode end=head;
        head.next=null;
        return new ListNode[]{result,end};
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode preNode=null;
        ListNode start=null;
        ListNode end=head;
        ListNode curr=head;
        while (curr!=null){
            start=curr;
            end=curr;
            int n=k;
            while (end!=null && --n!=0)
                end=end.next;
            if(end!=null){
                curr=end.next;
                end.next=null;
                ListNode[] reverse=reverse(start);
                if(preNode==null) {
                    head = reverse[0];
                }
                else{
                    preNode.next=reverse[0];
                }
                reverse[1].next = curr;
                preNode = reverse[1];
            }
            else break;
        }
            return head;
        }


    public static void main(String[] args) {
        ListNode end=new ListNode(8);
        ListNode o7=new ListNode(7,end);
        ListNode o6=new ListNode(6,o7);
        ListNode o5=new ListNode(5,o6);
        ListNode o4=new ListNode(4,o5);
        ListNode o3=new ListNode(3,o4);
        ListNode o2=new ListNode(2,o3);
        ListNode start=new ListNode(1,o2);
        ListNode result=reverseKGroup(start,2);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
    }
}
