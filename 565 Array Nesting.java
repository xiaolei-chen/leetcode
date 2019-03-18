class Solution {
    public int arrayNesting(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i] != Integer.MAX_VALUE){
                int start = nums[i];
                int count = 0;
                while(nums[start]<Integer.MAX_VALUE){
                    int temp = start;
                    start = nums[start];
                    nums[temp] = Integer.MAX_VALUE;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}