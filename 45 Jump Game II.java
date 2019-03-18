class Solution { //http://www.cnblogs.com/lichen782/p/leetcode_Jump_Game_II.html
    public int jump(int[] nums) {
        int res = 0;
        int n = nums.length;
        int last = 0; //上一步能到达的最远位置
        int cur = 0; //当前能到达的最远位置
        for(int i=0; i<n; ++i){
            if(i > last){ //当前位置超过了上一步能到达的最远位置，说明需要再跳一次
                last = cur;
                ++res;
            }
            cur = Math.max(cur, i + nums[i]);
        }
        return res;  
    }
}