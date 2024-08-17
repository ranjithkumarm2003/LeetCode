class Solution {
    public String shortestPalindrome(String s) {
       if(isPal(s)){
        return s;
       } 
       StringBuilder sb=new StringBuilder(s);
       int e=s.length();
       while(e!=0){
        String str=sb.substring(0,e);
           if(!isPal(str)){
            e--;
           }
           else{
            break;
           }
       }
       String ad=sb.substring(e,sb.length());
       String rev="";
       for(int i=ad.length()-1;i>=0;i--){
        String ss=Character.toString(ad.charAt(i));
        rev=rev+ss;
       }
     StringBuilder ns=new StringBuilder(rev);
     ns.append(sb);
      return ns.toString();
       
    }
    public boolean isPal(String s){
        int st=0;
        int  e=s.length()-1;
        
        while(st<=e){
            if(s.charAt(e)!=s.charAt(st)){
                return false;
            }
        st++;
        e--;
        }
        return true;
    }
}