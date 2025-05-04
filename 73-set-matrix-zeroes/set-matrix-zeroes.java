class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        Set<String>set=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    String s=""+i+","+j;
                    set.add(s);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(set.contains(""+i+","+j)){
                    int row=0;
                    int col=0;
                    while(row<n || col<m){
                        if(row<n){
                                  matrix[i][row]=0;
                           row++;
                        }
                        if(col<m){
                                  matrix[col][j]=0;
                        col++;
                        }
                      
                    }

                }
            }
        }

    }
}