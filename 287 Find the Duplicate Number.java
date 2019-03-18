class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        int t = 0;
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast) break;
        }
        while(true){ //找环的入口
            slow = nums[slow];
            t = nums[t];
            if(slow == t) break;
        }
        return slow;
    }
}