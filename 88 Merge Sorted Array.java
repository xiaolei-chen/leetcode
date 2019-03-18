class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
		int j = n-1;
		int k = m+n-1;
		while(i >=0 && j >= 0){
			if(nums1[i] > nums2[j]){ //�Ƚ�A��B�����һ��Ԫ�صĴ�С
				nums1[k] = nums1[i]; //�ѽϴ���Ǹ����뵽m+n-1��λ���ϣ���������ǰ��
                --k;
                --i;
            }else{
				nums1[k] = nums2[j];
                --k;
                --j;
            }
		}
		while(j >= 0){ //���A�е������B��ģ���Aѭ�����ˣ�B�л���Ԫ��û����A
			nums1[k] = nums2[j]; //ֱ���ø�ѭ����B�����е�Ԫ�ظ��ǵ�Aʣ�µ�λ��
            --k;
            --j;
        }
    }
}