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
        // create two arraylists
        ArrayList <ListNode> ans = new ArrayList<>();
        ArrayList <ListNode> bns = new ArrayList<>();
        // map ele to ans 
        for(ListNode n : lists){
            if(n!=null) ans.add(n);
        }
        if(ans.isEmpty()) return null;
        while(ans.size()+bns.size()>1){
            while(ans.size()>=2){
                ListNode a = ans.remove(ans.size()-1);
                ListNode b = ans.remove(ans.size()-1);
                bns.add(merge(a,b));
            }
            if(ans.size()==1) bns.add(ans.remove(0));
            while(bns.size()>=2){
                ListNode a = bns.remove(bns.size()-1);
                ListNode b = bns.remove(bns.size()-1);
                ans.add(merge(a,b));
            }
            if(bns.size()==1 && ans.isEmpty()) ans.add(bns.remove(0));
        }
        return ans.get(0);
        
    }
    public ListNode merge(ListNode h1, ListNode h2){
        ListNode dummy = new ListNode(-1);
        ListNode i = h1;
        ListNode j = h2;
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