package com.LinkedList.Medium;
import com.LinkedList.ListNode;

public class Q142 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        ListNode slow_pointer = head, fast_pointer = head;
        while (fast_pointer != null && fast_pointer.next != null) {
            slow_pointer = slow_pointer.next;
            fast_pointer = fast_pointer.next.next;
            if (slow_pointer == fast_pointer) {
                break;
            }
        }
        if(slow_pointer!=fast_pointer)
            return null;
        slow_pointer=head;
        while (slow_pointer!=fast_pointer){
            slow_pointer=slow_pointer.next;
            fast_pointer=fast_pointer.next;
        }
        return slow_pointer;
    }
}
