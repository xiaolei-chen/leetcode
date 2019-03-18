public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if (n == 0){
            return 0;
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; //����һλ
            if ((n & 1) == 1){ //�ж�n���һλ�ǲ���1
                result++;
            }
            n >>= 1; //����һλ
        }
        return result;
    }
}