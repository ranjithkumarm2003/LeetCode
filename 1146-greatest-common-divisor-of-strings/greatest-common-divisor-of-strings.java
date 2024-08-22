class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if(str1.indexOf(str2)==-1 && str2.indexOf(str1)==-1 ){
        return "";
       }
       int n1=str1.length();
       int n2=str2.length();
       
       String ss="";
      for(int i=n2-1;i>=0;i--){
        String cs=str2.substring(i,n2);
        String ms="";
        for(int j=0;j<n1;j++){
           ms=ms+cs;
           if(ms.equals(str1)){
           ss=cs;
            break;
           }
        }
        if(ms.equals(str1)){
            break;
        }
      }
    //   if(hm.size()==0){
    //   return "";
    //   }
    if(ss.length()==0){
        return "";
    }
      StringBuilder sb1=new StringBuilder(str1);
      StringBuilder sb2=new StringBuilder(str2);
      int c1=0;
      int c2=0;
      while(sb1.length()!=0){
        sb1.delete(0,ss.length());
        c1++;
      }
      while(sb2.length()!=0){
        sb2.delete(0,ss.length());
        c2++;
      }
      int gcd=0;
       for(int i=Math.min(c1,c2);i>=1;i--){
        if(c1%i==0 && c2%i==0){
           gcd=i;
           break;
        }
       }
       String str="";
       for(int i=0;i<gcd;i++){
        str=str+ss;
       }
      return str;
    }
}