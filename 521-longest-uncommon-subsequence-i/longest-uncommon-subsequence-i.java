class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
       int c=0;
       if(a.length()>b.length()){
        c=a.length();
       }
       else{
        c=b.length();
       }
       return c;
    }
}