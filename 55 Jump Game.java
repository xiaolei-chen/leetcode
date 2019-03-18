class Solution { //̰��
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;
        for(int i=0; i<n; ++i){
            if(i > reach || reach >= n-1) break; //��ǰ�������reach(false)��reach�Ѿ��ִ����һ��λ��(true)
            reach = Math.max(reach, i + nums[i]); //i+nums[i]��ʾ��ǰλ���ܵ�������λ��
        }
        return reach >= n-1;
    }
}