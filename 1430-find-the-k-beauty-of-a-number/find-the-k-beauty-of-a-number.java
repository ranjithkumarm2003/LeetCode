class Solution {
    public int divisorSubstrings(int num, int k) {
        int c=0;
        String s=""+num;
        for(int i=0;i<=s.length()-k;i++){
            try{
            if(num% Integer.valueOf(s.substring(i,i+k))==0) c++;
            }
            catch(ArithmeticException e){
                continue;
            }
        }
        return c;
    }
}