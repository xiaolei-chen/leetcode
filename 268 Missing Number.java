class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        for (int num : nums) {
            sum += num;
        }
        return expectedSum - sum;
    }
}

/*
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= (i ^ nums[i]);
        }
        return missing;
    }
}
*/