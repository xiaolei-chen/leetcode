class Solution {
    public int numFriendRequests(int[] ages) {
        // ����ӳ������
        int[] nums = new int[121];
        int[] sums = new int[121];
        int res = 0;
        //����������������
        for(int i=0; i<ages.length; ++i){
            nums[ages[i]]++;
        }
        //��������С�ڵ����±�����
        for(int i=1; i<121;++i){
            sums[i] = sums[i-1] + nums[i];
        }
        //����15û����
        for(int i=15; i<121; ++i){
            if(nums[i]==0){
                continue;
            }
            int count = 0;
            count = sums[i] - sums[i/2+7];
            count--; //�������Լ�
            res += count*nums[i];
        }
        return res;
    }
}