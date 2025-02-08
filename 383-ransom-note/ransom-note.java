class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
      int rfre[]=new int[26];
      int mfre[]=new int[26];
      for(int i=0;i<ransomNote.length();i++){
        rfre[(int)ransomNote.charAt(i)-97]++;
      }
      for(int i=0;i<magazine.length();i++){
        mfre[(int)magazine.charAt(i)-97]++;
      }
      for(int i=0;i<26;i++){
        if(rfre[i]!=0){
            if(rfre[i]>mfre[i]){
                return false;
            }
        }
      }
      return true;
    }
}