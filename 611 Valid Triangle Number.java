class Solution {
    public int triangleNumber(int[] nums) {
        int res = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; ++i){
            int left = 0;
            int right = i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    res = res+right-left;
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}