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
    public int length(ListNode head){
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        int n = length(head);
        if(n==0) return head;
        k%=n;
        if(k==0) return head;
        for(int i=0;i<k+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode ans = slow.next;
        slow.next = null;
        ListNode tail = ans;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = head;
        return ans;

        
    }
}