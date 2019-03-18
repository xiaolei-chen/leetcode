class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        int res = nums[0];
         while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]){ //��ǰ�����ǵ�������Ϊ������Сֵ�����Կ���ɾ���Ұ��
                right = mid;
            }else if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right--;
            }
        }
        return nums[left];
    }
}