class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        int rows = 0;
        int cols = 0;
        if(r*c != nums.length * nums[0].length)
            return nums;
        for(int i=0; i<nums.length; ++i){
            for(int j=0; j<nums[0].length; ++j){
                res[rows][cols] = nums[i][j];
                cols++;
                if(cols == c){
                    rows++;
                    cols=0;
                }
            }
        }
    return res;
    }
}