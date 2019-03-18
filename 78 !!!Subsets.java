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