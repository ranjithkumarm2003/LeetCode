import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int n=0;
        while (st.hasMoreTokens()) {
           
           n= st.nextToken().length();
        }
        return n;
    }
}