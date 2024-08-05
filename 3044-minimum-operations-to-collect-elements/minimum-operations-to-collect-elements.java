class Solution {
    public int minOperations(List<Integer> nums, int k) {
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=1;i<=k;i++){
            li.add(i);
        }
        int c=0;
        for(int i=nums.size()-1;i>=0;i--){
             if(li.contains(nums.get(i))){
                li.remove(nums.get(i));
             }
             c++;
             if(li.size()==0){
                return c;
             }
        }
        return c;
    }
}