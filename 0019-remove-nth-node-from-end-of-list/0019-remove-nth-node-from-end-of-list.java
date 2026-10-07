/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode prev = head;
        ListNode slow = head;
        if(head==null ||  head.next==null) return null;
        // n leads to fast 
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        // given n = 1st ele
        if(fast == null ) return head.next;
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        return head;
    }
}