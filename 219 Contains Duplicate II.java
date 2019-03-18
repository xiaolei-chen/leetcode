class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            Integer ord = map.put(nums[i], i); //返回与key关联的旧值；如果key没有任何映射关系，则返回null
            if(ord != null && i - ord <= k){ //ord不可能比i更大，所以不用绝对值
                return true;
            }
        }
        return false;
    }
}