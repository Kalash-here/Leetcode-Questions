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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList <ListNode> ans = new ArrayList<>();
        // map all elements into arrL
        ListNode temp = head; 
        while(temp!=null){
            ans.add(temp);
            temp=temp.next;
        }
        // set indices
        int i = left-1;
        int j = right-1;
        // swap nodes
        while(i<j){
            ListNode t1 = ans.get(i);
            ListNode t2 = ans.get(j);
            ans.set(i,t2);
            ans.set(j,t1);
            i++;
            j--;
        }
        // set up connections 
        for(i=0; i<ans.size();i++){
            ans.get(i).next= (i==ans.size()-1)? null : ans.get(i+1);
        }
        return ans.get(0);
    }
}