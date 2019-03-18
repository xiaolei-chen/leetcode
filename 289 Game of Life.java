class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; ++i){    // 细胞会自然死亡，不用考虑“死-->死”和“活-->死”
            for(int j=0; j<n; ++j){
                int lives = liveNeighbors(board, m, n, i, j);
                if(board[i][j]==1 && lives>=2 && lives<=3){
                    board[i][j] = 3; // 活-->活 对2取模为1
                }
                if(board[i][j]==0 && lives==3){
                    board[i][j] = 2; // 死-->活 对2取模为0
                }
            }
        }
        for(int i=0; i<m; ++i){
            for(int j=0; j<n; ++j){
                board[i][j] >>= 1;
            }
        }
    }
    
    private int liveNeighbors(int[][] board, int m, int n, int i, int j){
        int lives = 0;
        for(int x=Math.max(i-1,0); x<=Math.min(i+1,m-1); ++x){
            for(int y=Math.max(j-1,0); y<=Math.min(j+1,n-1); ++y){
                lives += board[x][y] & 1; // 判断有多少活细胞
            }
        }
        lives -= board[i][j] & 1; // 减去自身的状态
        return lives;
    }
}