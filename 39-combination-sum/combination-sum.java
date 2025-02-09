class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        solve(li,ll,candidates,target,0);
           return li;
    }
        public void solve(List<List<Integer>>li,List<Integer>ll,int []arr,int tar,int i){
            if(tar==0){
                li.add(new ArrayList<>(ll));
                return;
            }
            if(tar<0 || i>=arr.length){
                return ;
            }
            else{
                ll.add(arr[i]);
                solve(li,ll,arr,tar-arr[i],i);
                ll.remove(ll.size()-1);
                solve(li,ll,arr,tar,i+1);
            }
        }

    
}