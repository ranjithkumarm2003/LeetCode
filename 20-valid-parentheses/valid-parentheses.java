class Solution {
    public boolean isValid(String s) {
        //if(s.length()%2==1) return false;
        Stack <Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                st.push(c);
            } 
            else {
                if (c == ']') {
                    if(st.isEmpty()) return false;
                    char d = st.pop();
                    if (d != '[')return false;
                } else if (c == '}') {
                    System.out.println(st.toString());
                    if(st.isEmpty()) return false;
                    char d = st.pop();
                    if (d != '{') return false;
                } else {
                    if(st.isEmpty()) return false;
                    char d = st.pop();
                    if (d != '(')return false;
                }
            }
        }
        return st.isEmpty();
    }
}