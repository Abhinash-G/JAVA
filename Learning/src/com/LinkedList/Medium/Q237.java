package com.LinkedList.Medium;

import com.LinkedList.ListNode;

public class Q237 {
    public void deleteNode(ListNode node) {
//delete in O(1) time.
        node.val=node.next.val;
        node.next=node.next.next;

        //When you use too much brain for small task.
//        while(node.next.next!=null){
//            node.val=node.next.val;
//            node=node.next;
//        }
//        node.val=node.next.val;
//        node.next=null;
    }
}
