class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){return false;}
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int ss=s.charAt(i)-'a';
            int tt=t.charAt(i)-'a';
            if(ss!=tt){
                freq[ss]++;
                freq[tt]--;
            }
        }
        for(int i:freq){
            if(i!=0) return false;
        }
      
        return true;
    }
}