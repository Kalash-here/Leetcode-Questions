class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxi=Integer.MIN_VALUE;
        int[] brr = new int[n];
        brr[n-1]=-1;
        for(int i=n-1;i>=1;i--){
            maxi = Math.max(maxi,arr[i]);
            brr[i-1]=maxi;
        }
        return brr;
    }
}