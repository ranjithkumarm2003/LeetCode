class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int islands = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                islands++;
                expandIsland(grid, i, j);
                }
            }
        }

        return islands;
    }

    public void expandIsland(char[][]grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '-'){
            return;
        }
        if(grid[i][j] == '1'){
            grid[i][j] = '-';
            expandIsland(grid, i+1, j);
            expandIsland(grid, i, j+1);
            expandIsland(grid, i-1, j);
            expandIsland(grid, i, j-1);
        }
    }
}