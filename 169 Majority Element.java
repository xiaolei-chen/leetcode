class Solution { //摩尔投票法
    public int majorityElement(int[] nums) {
        int res = 0;
        int cnt = 0;
        for(int num : nums){
            if(cnt == 0){
                res = num;
                ++cnt;
            }else if(num == res){
                ++cnt;
            }else{
                --cnt;
            }
        }
        return res;
    }
}

/*
先将第一个数字假设为众数，然后把计数器设为1，比较下一个数和此数是否相等，若相等则计数器加一，反之减一。
然后看此时计数器的值，若为零，则将下一个值设为候选众数。
以此类推直到遍历完整个数组，当前候选众数即为该数组的众数。
*/