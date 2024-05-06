package com.LinkedList.Medium;
import com.LinkedList.ListNode;

public class Q2487 {
    public ListNode removeNodes(ListNode head) {
        //less space but slow.
        {
//            ListNode headCopy = head;
//            Stack<ListNode> stack = new Stack<>();
//            while (head != null) {
//                while (!stack.isEmpty() && stack.peek().val < head.val)
//                    stack.pop();
//                stack.push(head);
//                head = head.next;
//            }
//            ListNode prev = null;
//            while (!stack.isEmpty()) {
//                stack.peek().next = prev;
//                prev = stack.pop();
//            }
//            return prev;
        }
        // Faster but has a larger recursion Stack.
        {
//            if (head.next == null)
//                return head;
//            ListNode solution = removeNodes(head.next);
//            if (head.val < solution.val)
//                return solution;
//            else {
//                head.next = solution;
//                return head;
//            }
        }
        // Faster than before but call reverse function 2 times.
        {
//            head = reverse(head);
//            ListNode cur = head;
//            while (cur != null) {
//                while (cur.next != null && cur.next.val < cur.val) {
//                    cur.next = cur.next.next;
//                }
//                cur = cur.next;
//            }
//            cur = reverse(head);
//            return cur;
        }
        //Fastest
        {
            if(head.next == null){
                return head;
            }
            ListNode prevNode = head;
            ListNode currentNode = head.next;
            //reverse
            while(currentNode != null){
                ListNode nextNode = currentNode.next;
                currentNode.next = prevNode;
                prevNode = currentNode;
                currentNode = nextNode;
            }
//            ListNode prevNode = null;
//            ListNode cur=head;
//            while (cur != null) {
//                ListNode next = cur.next;
//                cur.next = prevNode;
//                prevNode = cur;
//                cur = next;
//            }
            head.next = null;
            head = prevNode;

            prevNode = head;
            currentNode = head.next;
            while(currentNode != null){
                if(currentNode.val < prevNode.val){
                    currentNode = currentNode.next;
                }
                else{
                    ListNode nextNode = currentNode.next;
                    currentNode.next = prevNode;
                    prevNode = currentNode;
                    currentNode = nextNode;
                }

            }
            head.next = null;
            head = prevNode;
            return head;
        }
    }
//    private ListNode reverse(ListNode cur) {
//        ListNode prev = null;
//        while (cur != null) {
//            ListNode next = cur.next;
//            cur.next = prev;
//            prev = cur;
//            cur = next;
//        }
//        return prev;
//    }

}
