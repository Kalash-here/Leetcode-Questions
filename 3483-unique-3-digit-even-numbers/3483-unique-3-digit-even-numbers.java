class Solution {
    public int totalNumbers(int[] digits) {
        HashSet <Integer> Set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    // single copy of a digit if appears once
                    if(i==j||j==k||i==k) continue;
                    // no leading zeros are allowed
                    if(digits[i]==0) continue;
                    // even digits at unit place
                    if(digits[k]%2!=0) continue;
                    int num = digits[i]*100+ digits[j]*10+digits[k];
                    Set.add(num);

                }
            }
        }
        return Set.size();
    }
}