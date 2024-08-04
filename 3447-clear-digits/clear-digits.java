class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<=sb.length()-1;i++){
            char ch=sb.charAt(i);
            if(ch>='0' && ch<='9'){
               sb.delete(i-1,i+1);
               i=-1;
            }

        }
        return sb.toString();
    }
}