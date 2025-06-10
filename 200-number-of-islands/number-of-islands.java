class Solution {
    int c=0;
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    solve(i,j,m,n,grid);
                    c++;
                }
            }
        }
        return c;
    }
    public void solve(int i,int j,int m, int n, char[][]arr){
        if(  i<0 || j<0 || i==m || j==n ||arr[i][j]=='0'){
             return ;  
        }
        arr[i][j]='0';
        solve(i-1,j,m,n,arr);
        solve(i+1,j,m,n,arr);
        solve(i,j-1,m,n,arr);
        solve(i,j+1,m,n,arr);
        
    }
}