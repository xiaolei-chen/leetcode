class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<nums.length; ++i){
            int next = Math.abs(nums[i])-1;
            if(nums[next] < 0){
                ans.add(Math.abs(next+1));
            }else{
                nums[next] = -nums[next];
            }
        }
        return ans;
    }
}