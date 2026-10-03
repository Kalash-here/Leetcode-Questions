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
    public ListNode reverseList(ListNode head) {
        // Recursive approach 
        if(head== null || head.next == null) return head;
        ListNode ans = head.next;
        head.next=null;
        ListNode a = reverseList(ans);
        ans.next=head;
        return a;
        
    }
}