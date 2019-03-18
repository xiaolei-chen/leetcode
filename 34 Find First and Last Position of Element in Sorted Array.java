class Solution {
    public int[] searchRange(int[] nums, int target) {
        double left = target - 0.5;
        double right = target + 0.5;
        int l = bs(nums, left);
        int r = bs(nums, right);
        if(l == r){
            return new int[]{-1, -1};
        }
        return new int[]{l, r-1};
    }
    
    // find the first number that is greater than or equal to target.
    //could return A.length if target is greater than A[A.length-1].
    private int bs(int[] nums, double target) {
        int lo = 0;
        int hi = nums.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(target > nums[mid]){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return lo;
    }
}