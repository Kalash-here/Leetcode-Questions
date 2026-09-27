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
        ArrayList <ListNode> ar = new ArrayList<>();
        ListNode temp = head;
        if(head ==null) return head;
        while(temp!=null){
            ar.add(temp);
            temp=temp.next;
        }
        int n = ar.size();
        for(int i=1;i<n;i++){
            ar.get(i).next=ar.get(i-1);
        }
        ar.get(0).next=null;
        return ar.get(n-1);
    }
}