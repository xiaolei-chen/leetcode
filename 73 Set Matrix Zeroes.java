class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;
        //先扫描第一行第一列，如果有0，则将各自的flag设置为true
        for(int i=0; i<m; ++i){
            if(matrix[i][0]==0){
                colZero = true;
            }
        }
        for(int j=0; j<n; ++j){
            if(matrix[0][j]==0){
                rowZero = true;
            }
        }
        //然后扫描除去第一行第一列的整个数组，如果有0，则将对应的第一行和第一列的数字赋0
        for(int i=1; i<m; ++i){
            for(int j=1; j<n; ++j){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        //再次遍历除去第一行第一列的整个数组，如果对应的第一行和第一列的数字有一个为0，则将当前值赋0
        for(int i=1; i<m; ++i){
            for(int j=1; j<n; ++j){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //最后根据第一行第一列的flag来更新第一行第一列
        if(colZero == true){
            for(int i=0; i<m; ++i){
                matrix[i][0] = 0;
            }
        }
        if(rowZero == true){
            for(int j=0; j<n; ++j){
                matrix[0][j] = 0;
            }
        }
    }
}