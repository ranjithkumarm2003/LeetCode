class Solution {
    public String longestCommonPrefix(String[] strs) {
       // StringBuilder sb=new StringBuilder();
       String ans="";
        Arrays.sort(strs);
        // System.out.print(Arrays.toString(strs));
        String str1=strs[0];
        String str2=strs[strs.length-1];
        for(int i=0;i<Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i) !=str2.charAt(i)){
                return ans;
            }
             ans+=str1.charAt(i);
        }
        return ans;
    }
}