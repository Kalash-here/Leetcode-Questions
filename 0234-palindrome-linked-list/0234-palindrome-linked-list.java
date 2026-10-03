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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode forward = null;
        ListNode curr=head;
        while(curr!=null){
            forward = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;

    }
    public boolean isPalindrome(ListNode head) {
        
        // find mid
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next !=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // divide into 2 ll
        ListNode head2 = slow.next;
        slow.next = null;
        //reverse second ll
        head2=reverse(head2);
        //compare values
        ListNode i = head;
        ListNode j=head2;
        while(j!=null){
            if(i.val!=j.val) return false;
            else{
                i=i.next;
                j=j.next;
            }
        }
        return true; 
    }
}