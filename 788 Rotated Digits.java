class Solution {
    public int rotatedDigits(int N) {
        int[] dp = new int[N+1];
        int count = 0;
        for(int i=0; i<N+1; i++){
            if(i<10){
                if(i==0 || i==1 || i==8){
                    dp[i] = 1;
                }else if(i==2 || i==5 || i==6 || i==9){
                    dp[i] = 2;
                    count++;
                }
            }else{
                int a = dp[i/10];
                int b = dp[i%10];
                if(a==1 && b==1){
                    dp[i] = 1;
                }else if(a >= 1 && b >= 1){
                    dp[i] = 2;
                    count++;
                }
            }
        }
        return count;
    }
}

/*
class Solution {
    public int rotatedDigits(int N) {
        int res = 0;
        for (int i = 1; i <= N; ++i) {
            if(check(i)){
                ++res;
            }
        }
        return res;
    }
    
    private boolean check(int k){
        boolean flag = false;
        while (k > 0) {
            if (k % 10 == 2) flag = true;
            if (k % 10 == 5) flag = true;
            if (k % 10 == 6) flag = true;
            if (k % 10 == 9) flag = true;
            if (k % 10 == 3) return false;
            if (k % 10 == 4) return false;
            if (k % 10 == 7) return false;
            k = k / 10;
        }
        return flag;
    }
}
*/