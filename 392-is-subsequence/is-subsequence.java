class Solution {
    public boolean isSubsequence(String s, String t) {
        int sn=s.length();
        int tn=t.length();
        int k=0;
        for(int i=0;i<sn;i++){
            if(k>=tn ){
               return false;
            }
           if(t.substring(k,tn).indexOf(s.charAt(i))==-1){
            return false;
           }
           else{
            k=k+t.substring(k,tn).indexOf(s.charAt(i))+1;
           }
        }
        return true;
    }
}