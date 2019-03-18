class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        int res = nums[0];
         while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]){ //当前区间是递增，因为是找最小值，所以可以删掉右半段
                right = mid;
            }else if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right--;
            }
        }
        return nums[left];
    }
}