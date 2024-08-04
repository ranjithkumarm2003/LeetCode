class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int arr[][]=new int [mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[i][j]=mat[i][j];
            }
        }

        while(k!=0){
        for(int i=0;i<mat.length;i++){
            int temp=mat[i][0];
            for(int j=0;j<mat[0].length-1;j++){
                mat[i][j]=mat[i][j+1];
            }
           mat[i][mat[i].length-1]=temp;
        }
        k--;
        }
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(arr[i][j]!=mat[i][j]){
                    return false;
                }
            }
        }
        
        return true;
    }
}