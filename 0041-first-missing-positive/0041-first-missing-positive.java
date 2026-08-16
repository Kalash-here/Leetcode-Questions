class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n = nums.length;
        while(i<n){
            if(nums[i]<=0||
            nums[i]>n||
            nums[i]==nums[nums[i]-1]||
            nums[i]==i+1) i++;
            else swap(nums,i,nums[i]-1);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return n+1;
        
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
} 