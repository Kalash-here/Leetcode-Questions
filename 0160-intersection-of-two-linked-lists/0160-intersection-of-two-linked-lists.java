/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA;
        ListNode t2 = headB;
        int count1 =0;
        int count2 =0;
        while(t1!=null){
            t1=t1.next;
            count1++;
        }
        while(t2!=null){
            t2=t2.next;
            count2++;
        }
        t1=headA;
        t2=headB;
        if(count1>count2){
            for(int i=0;i<count1-count2;i++) t1=t1.next;
        }
        if(count2>count1){
            for(int i=0;i<count2-count1;i++) t2=t2.next;
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1;
        
    }
}