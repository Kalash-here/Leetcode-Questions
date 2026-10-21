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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        // map arr elements to a arraylist
        ArrayList <ListNode> ans = new ArrayList<>();
        for(ListNode n : lists){
            ans.add(n);
        }
        // break when single list in arrylist
        while(ans.size()!=1){
            ListNode a = ans.get(ans.size()-1);
            ans.remove(a);
            ListNode b = ans.get(ans.size()-1);
            ans.remove(b);
            ListNode c = merge(a,b);
            ans.add(c);
        }
        return ans.get(0);
        
    }
    // merge function 
    public ListNode merge(ListNode h1, ListNode h2){
        ListNode i = h1;
        ListNode j = h2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }
            else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i==null) k.next=j;
        if(j==null) k.next=i;
        return dummy.next;
    }
}