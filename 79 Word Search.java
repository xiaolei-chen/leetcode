class Solution { //DFS
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++){
                if(exist(board, i, j, word, 0))
                    return true;
            }
        return false;
    }
    private boolean exist(char[][] board, int i, int j, String word, int ind){
        if(ind == word.length()) return true;
        if(i > board.length-1 || i<0 || j<0 || j>board[0].length-1 || board[i][j] != word.charAt(ind)){
            return false;
        }
        board[i][j]='*'; //将遍历过的位置改为*号
        boolean result =    exist(board, i-1, j, word, ind+1) ||  //上
                            exist(board, i+1, j, word, ind+1) ||  //下
                            exist(board, i, j-1, word, ind+1) ||  //左
                            exist(board, i, j+1, word, ind+1);    //右
        board[i][j] = word.charAt(ind); //递归调用完后恢复到之前的状态
        return result;
    }
}