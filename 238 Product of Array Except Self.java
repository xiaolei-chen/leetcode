class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leng = nums.length;
        int[] res = new int[leng];
        int right = 1;
        
        res[0]=1;
        for(int i=1; i<leng; ++i){
            res[i] = res[i-1] * nums[i-1];
        }
        
        for(int j=leng-1; j>=0; --j){
            res[j] = res[j] * right;
            right = right * nums[j];
        }
        return res;
    }
}