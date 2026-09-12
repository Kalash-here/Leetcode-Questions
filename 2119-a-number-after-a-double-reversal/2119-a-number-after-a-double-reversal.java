class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = reverse(num);
        int rev2 = reverse(rev1);
        if(num == rev2) return true;
        return false;
        
    }
    public int reverse(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
}