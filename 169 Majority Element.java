class Solution { //Ħ��ͶƱ��
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
�Ƚ���һ�����ּ���Ϊ������Ȼ��Ѽ�������Ϊ1���Ƚ���һ�����ʹ����Ƿ���ȣ���������������һ����֮��һ��
Ȼ�󿴴�ʱ��������ֵ����Ϊ�㣬����һ��ֵ��Ϊ��ѡ������
�Դ�����ֱ���������������飬��ǰ��ѡ������Ϊ�������������
*/