class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 1; //子数组[0, i]范围内并且一定包含nums[i]数字的最大子数组乘积
        int imin = 1; //子数组[0, i]范围内并且一定包含nums[i]数字的最小子数组乘积
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){  //交换imax和imin
                int tmp = imax; 
                imax = imin; 
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);
            
            max = Math.max(max, imax);
        }
        return max;
    }
}