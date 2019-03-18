class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]){ //峰值在后面
                left = mid + 1;
            }else{ //峰值在前面
                right = mid;
            }
        }
        return right;
    }
}

/*
class Solution {
    public int findPeakElement(int[] nums) {
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] < nums[i - 1]){
                return i - 1;
            }
        }
        return nums.length - 1;
    }
}
*/