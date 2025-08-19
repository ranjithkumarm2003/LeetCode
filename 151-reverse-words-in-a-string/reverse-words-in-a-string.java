import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
        
        String str="";
        int n=s.length();
        StringTokenizer st=new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            str=" "+st.nextToken()+str;
        }
        return str.trim();
    }    
}