class Solution {
    public int numFriendRequests(int[] ages) {
        // 构建映射数组
        int[] nums = new int[121];
        int[] sums = new int[121];
        int res = 0;
        //计算各个年龄的人数
        for(int i=0; i<ages.length; ++i){
            nums[ages[i]]++;
        }
        //计算年龄小于等于下标人数
        for(int i=1; i<121;++i){
            sums[i] = sums[i-1] + nums[i];
        }
        //低于15没朋友
        for(int i=15; i<121; ++i){
            if(nums[i]==0){
                continue;
            }
            int count = 0;
            count = sums[i] - sums[i/2+7];
            count--; //不包含自己
            res += count*nums[i];
        }
        return res;
    }
}