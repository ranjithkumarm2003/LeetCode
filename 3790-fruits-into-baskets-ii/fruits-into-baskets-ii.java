class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j] && fruits[i]!=0){
                    fruits[i]=0;
                    baskets[j]=0;
                    c++;
                  //  break;
                }
            }
        }
        return fruits.length-c;
    }
}