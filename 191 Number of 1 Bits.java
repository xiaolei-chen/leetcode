public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n ==0) return 0;
        int res = 0;
        for(int i=0; i<32; ++i){
            if((n & 1) == 1){
                res++;
            }
            n >>= 1;
        }
        return res;
    }
}