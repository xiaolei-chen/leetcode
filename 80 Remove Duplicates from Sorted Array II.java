class Solution {
    public int removeDuplicates(int[] nums) {
    	if(nums.length == 0) return 0;
    	int len = 1;
    	int cur = 1;
    	for(int i=1; i<nums.length; ++i){
    		if(nums[i] == nums[i-1]){
    			if(cur < 2){
    				nums[len] = nums[i];
                    len++;
    			}
    			cur++;
    		}else{
    			cur = 1;
    			nums[len] = nums[i];
                len++;
    		}
    	}
    	return len;
    }
}