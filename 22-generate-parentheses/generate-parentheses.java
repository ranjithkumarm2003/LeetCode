class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        String str="";
        solve(n,str,result,0,0);
        return result;
    }
    public void solve(int n,String str,List<String>result,int oc,int cc){
        if(oc==n && cc==n){
            System.out.println(str);
            result.add(str);
            return;
        }
        else{
            if(oc<n){
                solve(n,str+"(",result,oc+1,cc);
            }
            if(oc>cc){
                solve(n,str+")",result,oc,cc+1);
            }
        }
    }
}