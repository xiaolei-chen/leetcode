class Solution {
    public int uniquePaths(int m, int n) {
        double num = 1; //double防止阶乘越界
        double denom = 1;
        int small = m > n ? n : m;
        for (int i = 1; i <= small - 1; ++i) {
            num *= m + n - 1 - i;
            denom *= i;
        }
        return (int)(num / denom);
    }
}

/*
class Solution {  //动态规划 dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
    public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0) return 0;
        int[][] res = new int[m][n];
        for(int i=0; i<m; ++i){
            res[i][0] = 1;
        }
        for(int j=0; j<n; ++j){
            res[0][j] = 1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
               res[i][j] = res[i][j-1] + res[i-1][j]; //一行一行刷
            }
        }
        return res[m-1][n-1];
    }
}
*/

/*
class Solution { //优化
    public int uniquePaths(int m, int n) {
        if(m <= 0 || n <= 0) return 0;
        int[] res = new int[n];
        res[0] = 1;
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
               res[j] += res[j-1]; //一行一行刷
            }
        }
        return res[n-1];
    }
}
*/