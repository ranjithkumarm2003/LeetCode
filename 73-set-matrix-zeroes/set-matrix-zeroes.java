class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][j]=Integer.MAX_VALUE-5;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==Integer.MAX_VALUE-5){
                    int row=0;
                    int col=0;
                    while(row<n || col<m){
                        if(row<n){
                            if(matrix[i][row]!=Integer.MAX_VALUE-5)
                                  matrix[i][row]=0;
                           row++;
                        }
                        if(col<m){
                            if(matrix[col][j]!=Integer.MAX_VALUE-5)
                                  matrix[col][j]=0;
                        col++;
                        }
                      matrix[i][j]=0;
                    }

                }
            }
        }

    }
}