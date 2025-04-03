class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<=s.length()-3;i++){
            if(solve(s.substring(i,i+3))){
                c++;
            }
        }
        return c;
    }
    public boolean solve(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j) continue;
                if((int)Math.abs(s.charAt(i)-s.charAt(j))==0) return false;
            }
        }
        return true;
    }
}