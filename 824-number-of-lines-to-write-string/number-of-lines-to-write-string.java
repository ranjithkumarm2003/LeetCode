class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
         int c=0;
        for(int i=0;i<s.length();i++){
            if(sum+widths[(int)s.charAt(i)-97]>100){
               c++;
               sum=0;
               sum+=widths[(int)s.charAt(i)-97];
            }
            else{
                sum+=widths[(int)s.charAt(i)-97];
            }
        }
       if(sum>0) c++;
       return new int[]{c,sum};
    }
}