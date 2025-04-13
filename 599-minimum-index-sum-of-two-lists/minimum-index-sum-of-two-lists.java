class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int m = list1.length;
        int n = list2.length;
        int minInd = Integer.MAX_VALUE;
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int sum = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                // if(i==j) continue;
                if (list1[i].equals(list2[j])) {
                    sum = i + j;
                    break;
                }
            }
            if(sum<minInd){
                minInd=sum;
                li.removeAll(li);
                li.add(i);
            }
            else if(sum==minInd){
                li.add(i);
            }

        }
        String[]ans=new String[li.size()];
        int k=0;
        for(int i:li){
          ans[k++]=list1[i];
        }
        return ans;
    }
}