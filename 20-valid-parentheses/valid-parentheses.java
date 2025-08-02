class Solution {
    public boolean isValid(String s) {
        //if(s.length()%2==1) return false;
        if(s.length()%2!=0) return false;
        int top = -1;
        char[]stack = new char[s.length()];

        for(char ch : s.toCharArray()){
            if(ch=='(') stack[++top] = ')';
            else if(ch=='{') stack[++top] = '}';
            else if(ch=='[') stack[++top] = ']';
            else if(top == -1 || stack[top--]!=ch) return false;
        }
        return top == -1;
    }
}