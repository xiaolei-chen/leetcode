class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            Integer ord = map.put(nums[i], i); //������key�����ľ�ֵ�����keyû���κ�ӳ���ϵ���򷵻�null
            if(ord != null && i - ord <= k){ //ord�����ܱ�i�������Բ��þ���ֵ
                return true;
            }
        }
        return false;
    }
}