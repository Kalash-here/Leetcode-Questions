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
    public void reorderList(ListNode head) {
        // finding middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next=null;
        // reverse second list
        head2= reverse(head2);
        ListNode t1 =head;
        ListNode t2 =head2;
        while(t1!=null && t2!=null){
            ListNode next1 = t1.next;
            ListNode next2 = t2.next;
            t1.next=t2;
            t2.next=next1;
            t1=next1;
            t2=next2;
        }

        
        
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        while(curr!=null){
            forw = curr.next;
            curr.next= prev;
            prev=curr;
            curr= forw;
        }
        return prev;
    }
} 