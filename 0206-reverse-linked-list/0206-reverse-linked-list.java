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
        ArrayList <ListNode> ans = new ArrayList<>();
        ListNode temp = head;
        if(head == null) return head;
        while(temp!=null){
            ans.add(temp);
            temp=temp.next;
        }
        int n = ans.size();
        for(int i=1;i<n;i++){
            ans.get(i).next=ans.get(i-1);
        }
        ans.get(0).next=null;
        return ans.get(n-1);
        
    }
}