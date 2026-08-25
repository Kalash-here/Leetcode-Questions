class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> map = new HashSet<>();
        for(int i : nums){
            map.add(i);
        }
        int res = k;
        while(map.contains(res)){
            res+=k;
        }
        return res;
        
    }
}