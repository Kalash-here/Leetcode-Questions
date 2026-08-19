class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List <List<Integer>> ans = new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            minDiff = Math.min(minDiff,arr[i+1]-arr[i]);
        }
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i]==minDiff){
                List <Integer> a = new ArrayList<>();
                a.add(arr[i]);
                a.add(arr[i+1]);
                ans.add(a);
            }

        }
        return ans;
    }
}