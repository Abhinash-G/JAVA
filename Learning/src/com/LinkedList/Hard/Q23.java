package com.LinkedList.Hard;

import com.LinkedList.ListNode;

public class Q23 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result=new ListNode(-1);
        ListNode resultFinal=result;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                result.next=list1;
                result=result.next;
                list1=list1.next;
            }
            else{
                result.next=list2;
                result=result.next;
                list2=list2.next;
            }
        }
        ListNode temp=(list1==null)?list2:list1;
        while(temp!=null){
            result.next=temp;
            result=result.next;
            temp=temp.next;
        }
        return resultFinal.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return new ListNode();
        else if(lists.length==1)
            return lists[0];
        ListNode result=lists[0];
        for(int i=1;i<lists.length;i++){
            result=mergeTwoLists(result,lists[i]);
        }
        return result;
    }
}
