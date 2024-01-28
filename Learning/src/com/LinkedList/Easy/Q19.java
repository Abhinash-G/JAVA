package com.LinkedList.Easy;

import com.LinkedList.ListNode;

public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode(-01,head);
        ListNode end=head;
        for(int i=0;i<n;i++) {
            end = end.next;
        }
        if(end==null){
            return head.next;
        }
        while(end!=null){
            end=end.next;
            start=start.next;
        }
        start.next=start.next.next;
        return head;
    }
    public String toString(ListNode head) {
        String result="";
        while(head!=null){
            result+=String.valueOf(head.val)+" , ";
            head=head.next;
        }
        return result;
    }
    public static void main(String[] args) {
        Q19 ob=new Q19();
        ListNode end=new ListNode(5);
        ListNode o4=new ListNode(4,end);
        ListNode o3=new ListNode(3);
        ListNode o2=new ListNode(2,o3);
        ListNode start=new ListNode(1,o2);
        System.out.println(ob.toString(ob.removeNthFromEnd(start,1)));
    }
}
