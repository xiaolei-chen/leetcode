class Solution {
    public int singleNumber(int[] nums) { // 00->10->01->00 (0->1->2->3/0)
        int ones = 0;
        int twos = 0;
        for(int i = 0; i < nums.length; i++){
            ones = (ones ^ nums[i]) & ~twos; //ones = ones ^ A[i]; if (twos == 1) then ones = 0
            twos = (twos ^ nums[i]) & ~ones; //twos = twos ^ A[i]; if (ones* == 1) then twos = 0
        }
        return ones;
    }
}