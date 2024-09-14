class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
          char arr[]=allowed.toCharArray();
        int mcount=0;
        for(int i=0;i<words.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<words[i].length();k++){
                    if(words[i].charAt(k)==arr[j]){
                      c++;
                    }
                }
            }
            if(c==words[i].length()){
                mcount++;
            }
        }
        return mcount;
    }
}