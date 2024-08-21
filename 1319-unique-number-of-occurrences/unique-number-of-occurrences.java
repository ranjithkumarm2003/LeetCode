class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]==200) return false;
        ArrayList<Integer>li=new ArrayList<>();
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                li.add(c);
                break;
            }
            if(arr[i]==arr[i+1]){
              c++;
            }
            else{
                li.add(c);
                c=1;
            }
        }
        int s=0;int e=li.size()-1;int n=li.size();
       
        while(e!=-1){
            if(s==n){
                e--;
                s=0;
                continue;
            }
            if(s==e){
                s++;
                continue;
            }
           if(li.get(e)==li.get(s)){
            return false;
           }
           else{
            s++;
           }
        }
        return true;
    }
}