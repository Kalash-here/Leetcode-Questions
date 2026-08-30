class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        for(int x : nums1) set.add(x);
        HashSet <Integer> newset = new HashSet<>();
        for(int y : nums2) {
            if(set.contains(y)) newset.add(y);
        }
        int[] arr = new int [newset.size()];
        int indx = 0;
        for(int n : newset){
            arr[indx]=n;
            indx++;
        }
        return arr;
        
    }
}