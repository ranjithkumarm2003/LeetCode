class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String>li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                 if(arr[i].equals(arr[j])){
                    c++;
                 }
            }
            if(c==1){
                li.add(arr[i]);
            }
        }
        if (k - 1 < li.size()) {
            return li.get(k - 1);
        } else {
            return "";
        }
    }
}