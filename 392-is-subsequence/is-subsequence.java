class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        for(int i=0;i<s.length();i++){
            if(k>=t.length() ){
               return false;
            }
           if(t.substring(k,t.length()).indexOf(s.charAt(i))==-1){
            return false;
           }
           else{
            k=k+t.substring(k,t.length()).indexOf(s.charAt(i))+1;
           }
        }
        return true;
    }
}