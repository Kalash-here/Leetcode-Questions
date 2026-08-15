class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String ch : operations){
            if(ch.equals("++X") || ch.equals("X++")) ans+=1;
            else ans-=1;
        }
        return ans;
    }
}