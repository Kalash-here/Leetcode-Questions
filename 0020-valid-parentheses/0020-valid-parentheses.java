class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        int n = s.length();
        if(n%2==1) return false;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            //opening bracket
            if(ch=='('||ch=='{'||ch=='[')st.push(ch);
            // closing bracket 
            else{
                if(st.size()==0) return false;
                char top = st.peek();
                if(sameStyle(ch,top)) st.pop();
                else return false;
            }

        }          
        return st.size()==0;   
    }
    public boolean sameStyle(char ch , char top){
        if(top=='('&& ch==')') return true;
        if(top=='{'&& ch=='}') return true;
        if(top=='['&& ch==']') return true;
        return false;
    }
}