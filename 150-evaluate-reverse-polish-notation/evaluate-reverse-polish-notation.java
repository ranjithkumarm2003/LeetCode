class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
            if("+-*/".indexOf(s)!=-1){
                int n2=st.pop();
                int n1=st.pop();
                if(s.equals("+"))
                  st.push(n1+n2);
                else if(s.equals("-"))
                  st.push(n1-n2);
                 else if(s.equals("*"))
                  st.push(n1*n2);
                  else
                  st.push(n1/n2);

            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}