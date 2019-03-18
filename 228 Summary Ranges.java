class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<nums.length; ++i){ //����һ������
            int a = nums[i];
            while(i+1<nums.length && nums[i]+1==nums[i+1]){ //�����һ�����ǲ��ǵ�����
                i++;
            }
            if(a != nums[i]){ //������β���ֺͼ�ͷ��->"
                res.add(a+"->"+nums[i]);
            }else{ //һ����ֱ�Ӵ�����
                res.add(a+"");
            }
        }
        return res;
    }
}