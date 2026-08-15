class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int indx = nums[i]-1;
            if(nums[i]==i+1 || nums[indx]==nums[i])i++;
            else {
                swap(nums,i,indx);
            }
        }
        for(i=0;i<n;i++){
            if(nums[i] != i+1) return nums[i];
        }
        return -1;
    }
    public static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}