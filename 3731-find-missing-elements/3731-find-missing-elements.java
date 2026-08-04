class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){  //works till last 2nd index (i+1)
            int curr=nums[i];
            int next = nums[i+1];
            for( int missing=curr+1;missing<next;missing++){
                ans.add(missing);
            }



        }
        return ans;
        
    }
}