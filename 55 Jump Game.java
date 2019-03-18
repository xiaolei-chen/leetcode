class Solution { //贪婪
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for(int i=0; i<n; ++i){
            if(i > reach || reach >= n-1) break; //当前坐标大于reach(false)或reach已经抵达最后一个位置(true)
            reach = Math.max(reach, i + nums[i]); //i+nums[i]表示当前位置能到达的最大位置
        }
        return reach >= n-1;
    }
}