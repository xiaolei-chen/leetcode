class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < nums[right]){ //如果中间的数小于最右边的数，则右半段是有序的
                if (nums[mid] < target && nums[right] >= target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }else{ //若中间数大于最右边数，则左半段是有序的
                if(nums[mid] > target && nums[left] <= target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return -1; 
    }
}