class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        String ans[]=new String[numRows];
        //Arrays.fill(ans,"");
        for(int i=0;i<ans.length;i++){
            ans[i]="";
        }
        int k=0;
        boolean down=true;
        boolean up=false;
        for(int i=0;i<s.length();i++){
            if(down){
                ans[k++]+=s.charAt(i);
            }
            else if(up){
                ans[k--]+=s.charAt(i);
            }
            if(k==numRows){
                k=numRows-2;
                up=true;
                down=false;
            }
            else if(k==-1){
                k+=2;
                up=false;
                down=true;
            }
        }
        String res="";
        for(int i=0;i<numRows;i++){
            if(ans[i]!=null)
              res+=ans[i];
        }
        return res;
    }
}