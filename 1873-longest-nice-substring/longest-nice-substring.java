class Solution {
    public String longestNiceSubstring(String s) {
       
        int n=s.length();
        if(n<=1)return "";
        int k=s.length();
        if(k<=2 && ((int)Math.abs(s.charAt(0)-s.charAt(1))==32))return s;
        else if(k<=2) return"";
        int max=-1;
        while(k>=2){
            int i=0;
           while(i+k<=n){
              if(solver(s.substring(i,i+k))){
                if(s.substring(i,i+k).length()>max){
                   
                 return s.substring(i,i+k); 
                 // max=s.substring(i,i+k).length();
                }
              }
              i++;
           }
           k--;
        }
        return "";
    }
    public boolean solver(String s){
         for(int i=0;i<s.length();i++){
            int c=0;
             for(int j=0;j<s.length();j++){
                if((int)Math.abs(s.charAt(i)-s.charAt(j))==32){
                    c++;
                }
             }
             if(c==0){
                return false;
             }
        }
        return true;

    } 
       
}