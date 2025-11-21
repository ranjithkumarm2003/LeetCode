class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        
            List<Integer> first = new ArrayList<>();
            first.add(1);
            result.add(first);
            if (numRows == 1) {
            return result;
        }
        for(int i=1;i<numRows;i++){
            List<Integer> num=result.get(i-1);
            List<Integer> li=new ArrayList<>();
            li.add(1);li.add(1);
            for(int j=0;j<numRows-1 && li.size()<i+1;j++){
                li.add(j+1,(num.get(j)+num.get(j+1))); 
            }
            result.add(li);

             
        }
        return result;
    }
}
