class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(true){
            for(int j=left; j<= right; ++j) res.add(matrix[up][j]);
            up++;
            if(left>right || up>down) break;
            
            for(int i=up; i<= down; ++i) res.add(matrix[i][right]);
            right--;
            if(left>right || up>down) break;
            
            for(int j=right; j>= left; --j) res.add(matrix[down][j]);
            down--;
            if(left>right || up>down) break;
            
            for(int i=down; i>= up; --i) res.add(matrix[i][left]);
            left++;
            if(left>right || up>down) break;
        }
        return res;
    }
}