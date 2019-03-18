class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            if(n == Integer.MIN_VALUE){
                return myPow(x, n+1)/x;  // -MIN_VALUE = MAX_VALUE+1
            }else{
                n = -n;
                x = 1/x;
            }
        }
        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
    }
}