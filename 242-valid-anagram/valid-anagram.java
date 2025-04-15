class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){return false;}
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int j=0;j<t.length();j++)
        {
            if(freq[t.charAt(j)-'a']==0){return false;}
            freq[t.charAt(j)-'a']--;
        }
        return true;
    }
}