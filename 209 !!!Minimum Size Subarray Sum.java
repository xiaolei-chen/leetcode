class Solution { // O(n) ̰��
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = nums.length;
        int res = len + 1;
        while(right < len){
            while(sum < s && right < len){ //ֱ��������ʹ��ڵ��ڸ���ֵ����right�ﵽ����ĩβ
                sum += nums[right];
                right++;
            }
            while(sum >= s){
                res = Math.min(res, right-left);
                sum -= nums[left];
                left++;
            }
        }
        return (res == len + 1) ? 0 : res;
    }
}




class Solution { // O(nlogn) ����
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        int[] sums = new int[n+1]; 
        for(int i=1; i<n+1; ++i){ //���ַ���Ҫ�������顣����������������
            sums[i] = sums[i-1] + nums[i-1]; //sums[i]��ʾnums������[0, i-1]�ĺ�
        }
        for(int i=0; i<n; ++i){ //Ѱ���ұ߽�
            int left = i + 1;
            int right = n;
            int t = sums[i] + s;  //ֻ��Ҫ�жϵ�ǰ��ֵ����s���ں�����ĸ�ֵ���Ϳ��Եó������ֵ���±�
            while(left <= right){ //�ұ߽���sums[right] >sums[left] + s��ֵ
                int mid = left + (right - left) / 2;
                if(sums[mid] < t){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            if (left == n + 1) break;
            res = Math.min(res, left - i);
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}