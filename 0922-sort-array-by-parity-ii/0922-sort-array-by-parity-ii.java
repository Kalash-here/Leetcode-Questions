class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i =0;
        int [] ans = new int[nums.length];
        for(int x : nums){
            if(x%2==0){
                ans[i]=x;
                i+=2;
            }
        }
        i=1;
        for(int x : nums){
            if(x%2!=0){
                ans[i]=x;
                i+=2;
            }
        }
        return ans;
        
    }
}