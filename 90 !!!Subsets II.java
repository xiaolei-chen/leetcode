class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>()); //��ʼ����һ���ռ�
        int size = 1; //����Ҫ���в������Ӽ�����
        int last = nums[0]; //��һ������
        for(int i=0; i<nums.length; ++i){
            if(last != nums[i]) { //�����ǰ�����Ԫ��û�г��ֹ�
                last = nums[i];
                size = res.size();
            }
            //������ظ����֣������������Ӽ�����Ŀ���ϴ���ͬ
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