class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 1; //������[0, i]��Χ�ڲ���һ������nums[i]���ֵ����������˻�
        int imin = 1; //������[0, i]��Χ�ڲ���һ������nums[i]���ֵ���С������˻�
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){  //����imax��imin
                int tmp = imax; 
                imax = imin; 
                imin = tmp;
            }
            imax = Math.max(imax*nums[i], nums[i]);
            imin = Math.min(imin*nums[i], nums[i]);
            
            max = Math.max(max, imax);
        }
        return max;
    }
}