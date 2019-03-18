class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; ++i){
            int next = Math.abs(nums[i])-1;
            if(nums[next] > 0){
                nums[next] = -nums[next];
            }
        }
        
        for(int i=0; i<nums.length; ++i){
            if(nums[i] > 0){
              res.add(i+1);
            }
        }
    return res;
    }
}