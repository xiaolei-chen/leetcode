class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0) return res;
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, list, used, res);
        return res;    
    }
    
    public void backtrack(int[] nums, List<Integer> list, boolean[] used, List<List<Integer>> res){
        if(list.size() == nums.length){
            res.add(new ArrayList(list));
            return;
        }
        for(int i=0; i<nums.length; ++i){
            if(used[i])
                continue;
            used[i] = true;
            list.add(nums[i]);
            backtrack(nums, list, used, res);
            used[i] = false;
            list.remove(list.size()-1);
        }
    }
}

/*
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0) return result;
        backtrack(result, nums, new ArrayList<Integer>(), 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, List<Integer> currentList, int index) {
        if (currentList.size() == nums.length) {
            result.add(currentList);
            return;
        }
        int n = nums[index];
        for (int i = 0; i <= currentList.size(); i++) {
            List<Integer> copy = new ArrayList<Integer>(currentList);
            copy.add(i, n);
            backtrack(result, nums, copy, index + 1);
        } 
    }
}
*/