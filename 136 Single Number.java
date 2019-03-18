class Solution { 
    public int singleNumber(int[] nums) { //XOR : 0^N=N, N^N=0
        int res = 0;
        for(int i=0; i<nums.length; ++i){
            res ^= nums[i];
        }
        return res;
    }
}