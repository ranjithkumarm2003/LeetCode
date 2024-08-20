class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !isSafe(i,j,board)){
                  return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(int a,int b,char[][]board){
        for(int i=0;i<9;i++){
            if(i!=b && board[a][i]==board[a][b]){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(i!=a && board[i][b]==board[a][b]){
                return false;
            }
        }
        int x,y;
        x=(a/3)*3;
        y=(b/3)*3;
        for(int i=x;i<=x+2;i++){
            for(int j=y;j<=y+2;j++){
                if(i!=a && j!=b && board[i][j]==board[a][b]){
                    return false;
                }
            }
        }
        return true;
    }
}