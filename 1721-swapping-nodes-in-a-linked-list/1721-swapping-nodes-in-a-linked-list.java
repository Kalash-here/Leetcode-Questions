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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1 = head;
        ListNode fast = head;
        ListNode slow = head;
        // access first kth node 
        for(int i=1;i<k;i++){
            temp1=temp1.next;
        }
        // access last kth node 
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // swapping nodes values
        int temp=temp1.val;
        temp1.val=slow.val;
        slow.val=temp;
        return head;
    }
}