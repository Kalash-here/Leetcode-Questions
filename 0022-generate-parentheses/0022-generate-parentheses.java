class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(n,0,0,"",ans);
        return ans;
        
    }
    public static void helper(int n,int l,int r, String s,ArrayList <String> ls){
        // Base case
        if(r==n){
            ls.add(s);
            return;
        }
        if(l<n) helper(n,l+1,r,s+"(",ls);
        if(r<l) helper(n,l,r+1,s+")",ls);
    }
}