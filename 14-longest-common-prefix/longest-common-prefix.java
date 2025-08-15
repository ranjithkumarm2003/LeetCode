class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int n=strs.length;
        int k=0;
        for(int i=0;i<strs[0].length();i++){
            boolean flag=true;
            for(int j=1;j<n;j++){
               if(!(k<strs[j].length()) || !(k<strs[0].length())){
                flag=false;
                break;
               }
               if(!(strs[0].charAt(k)==strs[j].charAt(k))){
                   flag=false;
                break; 
                }
            } 
            if(flag){
                ans+= strs[0].charAt(k++);         
            }
            else{
                break;
            }
        }
        return ans;
    }
}

// if (strs == null || strs.length == 0) return "";

//         String pref = strs[0];
//         int prefLen = pref.length();

//         for (int i = 1; i < strs.length; i++) {
//             String s = strs[i];
//             while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
//                 prefLen--;
//                 if (prefLen == 0) {
//                     return "";
//                 }
//                 pref = pref.substring(0, prefLen);
//             }
//         }

//         return pref; 