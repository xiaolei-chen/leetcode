class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }   
    }
}


/*
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        int totalNumber = 1 << nums.length; //左移n位就相当于乘以2的n次方
        List<List<Integer>> collection = new ArrayList<List<Integer>>(totalNumber);
        for (int i=0; i<totalNumber; ++i) {
            List<Integer> set = new LinkedList<Integer>();
            for (int j=0; j<nums.length; ++j) {
                if ((i & (1<<j)) != 0) {
                    set.add(nums[j]);
                }
            }
            collection.add(set);
        }
        return collection;
    }
}
*/