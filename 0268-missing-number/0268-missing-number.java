class Solution {
    public int missingNumber(int[] nums) {
        // Cyclic sort
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]==i || nums[i]==n) i++;
            else {
                int indx = nums[i];
                swap(nums,i,indx);
            }

        }
        for(i=0;i<n;i++){
            if(nums[i]!= i) return i;

        }
        return n;
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}