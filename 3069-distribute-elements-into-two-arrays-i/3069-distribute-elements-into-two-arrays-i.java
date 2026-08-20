class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] brr = new int[n];
        arr[0]=nums[0];
        brr[0]=nums[1];
        int count1=1;
        int count2=1;
        for(int i=2;i<nums.length;i++){
            if(arr[count1-1]>brr[count2-1]) arr[count1++]=nums[i];
            else brr[count2++]=nums[i];
        }
        int[] ans = new int[n];
        System.arraycopy(arr,0,ans,0,count1);
        System.arraycopy(brr,0,ans,count1,count2);
        return ans;
        
    }
}