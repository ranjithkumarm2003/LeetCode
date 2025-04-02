class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int ans[]=new int[s.length()];
        int pre[]=new int[s.length()];
        int suf[]=new int[s.length()];
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                if(s.charAt(j)==c){
                    pre[i]=Math.abs(i-j);
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(s.charAt(j)==c){
                    suf[i]=Math.abs(i-j);
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(pre[i]==0 && suf[i]==0) continue;
            else if(pre[i]==0 && suf[i]!=0) ans[i]=suf[i];
            else if(pre[i]!=0 && suf[i]==0) ans[i]=pre[i];
            else ans[i]=Math.min(pre[i],suf[i]);
        }
      return ans;

    }
}