class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int top = 0;
        int left = 0;
        int down = n-1;
        int right = n-1;
        int count = 1;
        while(left<=right){
            for(int j=left; j<=right; j++){
                res[top][j] = count++;
            }
            top++;
            for(int i=top; i<=down; i++){
                res[i][right] = count++;
            }
            right--;
            for(int j=right; j>=left; j--){
                res[down][j] = count++;
            }
            down--;
            for(int i=down; i>=top; i--){
                res[i][left] = count++;
            }
            left++;
        }
        return res;
    }
}