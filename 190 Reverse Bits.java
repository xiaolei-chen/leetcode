public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; //左移一位
            if ((n & 1) == 1){ //判断n最后一位是不是1
                result++;
            }
            n >>= 1; //右移一位
        }
        return result;
    }
}