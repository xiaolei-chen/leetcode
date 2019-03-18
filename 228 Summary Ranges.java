class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<nums.length; ++i){ //遍历一遍数组
            int a = nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){ //检查下一个数是不是递增的
                i++;
            }
            if(a != nums[i]){ //存入首尾数字和箭头“->"
                res.add(a+"->"+nums[i]);
            }else{ //一个数直接存入结果
                res.add(a+"");
            }
        }
        return res;
    }
}