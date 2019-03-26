class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>()); //开始加入一个空集
        int size = 1; //即将要进行操作的子集数量
        int last = nums[0]; //上一个数字
        for(int i=0; i<nums.length; ++i){
            if(last != nums[i]) { //如果当前处理的元素没有出现过
                last = nums[i];
                size = res.size();
            }
            //如果有重复数字，即将操作的子集的数目和上次相同
            int newSize = res.size();
            for(int j=newSize-size; j<newSize; ++j){
                List<Integer> set = new ArrayList<>(res.get(j)); 
                set.add(nums[i]);
                res.add(set);
            }
        }
        return res;
    }
}

/*
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) 
                continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }   
    } 
}
*/