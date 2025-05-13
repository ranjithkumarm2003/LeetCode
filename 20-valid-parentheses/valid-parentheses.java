class Solution {
    public boolean isValid(String s) {
        //if(s.length()%2==1) return false;
        Stack <Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                st.push(c);
            } 
            else if(st.isEmpty()) return false;
            else {
                if (c == ']') {
                    char d = st.pop();
                    if (d != '[')return false;
                } else if (c == '}') {
                    char d = st.pop();
                    if (d != '{') return false;
                } else {
                    char d = st.pop();
                    if (d != '(')return false;
                }
            }
        }
        return st.size()==0;
    }
}