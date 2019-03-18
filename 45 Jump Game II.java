class Solution { //http://www.cnblogs.com/lichen782/p/leetcode_Jump_Game_II.html
    public int jump(int[] nums) {
        int res = 0;
        int n = nums.length;
        int last = 0; //��һ���ܵ������Զλ��
        int cur = 0; //��ǰ�ܵ������Զλ��
        for(int i=0; i<n; ++i){
            if(i > last){ //��ǰλ�ó�������һ���ܵ������Զλ�ã�˵����Ҫ����һ��
                last = cur;
                ++res;
            }
            cur = Math.max(cur, i + nums[i]);
        }
        return res;  
    }
}