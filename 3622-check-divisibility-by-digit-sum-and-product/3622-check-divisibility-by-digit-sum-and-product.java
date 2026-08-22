class Solution {
    public boolean checkDivisibility(int n) {
        int ans = digitSum(n)+digitProd(n);
        return n%(ans)==0;
    }
    public int digitSum(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
     public int digitProd(int n){
        int sum =1;
        while(n>0){
            sum *= n%10;
            n/=10;
        }
        return sum;
    }
}