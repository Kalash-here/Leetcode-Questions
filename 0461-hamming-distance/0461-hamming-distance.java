class Solution {
    public int hammingDistance(int x, int y) {
        int ans = 0;
        int num = x^y;
        while(num!=0){
            if((num & 1)==1){
                ans++;
            }
            num=num>>1;
        }
        return ans;
    }
}