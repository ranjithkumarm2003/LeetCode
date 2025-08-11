class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int sfre[]=new int[26];
        int tfre[]=new int[26];
        for(int i=0;i<s.length();i++){
            sfre[(int)(s.charAt(i)-97)]++;
            tfre[(int)(t.charAt(i)-97)]++;
        }
        for(int i=0;i<26;i++){
            if(sfre[i]!=tfre[i]) return false;
        }
        return true;
    }
}























// if(s.length()!=t.length()){return false;}
//         int freq[]=new int[26];
//         for(int i=0;i<s.length();i++)
//         {
//             int ss=s.charAt(i)-'a';
//             int tt=t.charAt(i)-'a';
//             if(ss!=tt){
//                 freq[ss]++;
//                 freq[tt]--;
//             }
//         }
//         for(int i:freq){
//             if(i!=0) return false;
//         }
      
//         return true;