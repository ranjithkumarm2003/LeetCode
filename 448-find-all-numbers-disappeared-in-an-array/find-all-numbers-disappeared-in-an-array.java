class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> li=new HashSet<>();
        for(int j:nums){
            li.add(j);
        }
        ArrayList<Integer>l=new ArrayList<>();
        
        int i=1;
        int n=nums.length;
        while(i<=n){
            if(li.contains(i)){
                i++;
                continue;
            }else{
                l.add(i);
                i++;
                continue;
            }
        }return l;
    }
}