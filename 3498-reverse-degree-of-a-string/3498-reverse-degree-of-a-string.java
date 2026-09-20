class Solution {
    public int reverseDegree(String s) {
        int result =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = 26-(ch-'a');
            result+=val*(i+1);
        }
        
        return result;
        
    }
}