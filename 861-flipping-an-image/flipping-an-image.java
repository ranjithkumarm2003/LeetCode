class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int arr[][]=new int [n][n];
        for(int i=0;i<n;i++){
            int k=0;
            for(int j=n-1;j>=0;j--){

               if(image[i][j]==0) arr[i][k]=1;
               else arr[i][k]=0;
               k++;
            }
        }
         return arr;
    }
}