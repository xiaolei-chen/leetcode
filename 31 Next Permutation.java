class Solution {
    public void nextPermutation(int[] nums) {
       int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){ //寻找降序
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(j>=0 && nums[j]<=nums[i]){ //寻找一个最小的j使其满足A[j]>A[i]，j必存在
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }
    
    private void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}