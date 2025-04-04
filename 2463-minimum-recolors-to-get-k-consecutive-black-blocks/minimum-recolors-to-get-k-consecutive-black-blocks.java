class Solution {
    public int minimumRecolors(String blocks, int k) {
       int Min_wc=101;
       for(int i=0;i<=blocks.length()-k;i++){
           int wc=counter(blocks.substring(i,i+k));
           Min_wc=Math.min(wc,Min_wc);
       } 
       return Min_wc;
    }
    public int counter(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W')c++;
        }
        return c;
    }
}