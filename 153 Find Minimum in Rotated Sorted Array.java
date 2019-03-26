class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int left = 0;
        int right = nums.length - 1;
        if (nums[right] > nums[0]) return nums[0];
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid < nums.length-1 && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }else if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return -1;
    }
}