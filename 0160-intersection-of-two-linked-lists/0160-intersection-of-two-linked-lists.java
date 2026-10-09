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
        //streak bna rhi bss
        int count1=0;
        int count2=0;
        ListNode temp = headA;
        while(temp!=null){
            temp=temp.next;
            count1++;
        }
        temp=headB;
        while(temp!=null){
            temp=temp.next;
            count2++;
        }
        ListNode temp1=headA;
        ListNode temp2=headB;
        if(count1>count2){
            for(int i=0;i<count1-count2;i++){
                temp1=temp1.next;

            }
        }
        if(count1<count2){
            for(int i=0;i<count2-count1;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
        
    }
}