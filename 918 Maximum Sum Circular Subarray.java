class Solution {
    public int maxSubarraySumCircular(int[] A) { // -2, 1, -3, 4, -1, 2, 1, -5, 4
        int total = A[0];
        int curMax = A[0];// ������ǰԪ�ص����ֵ
		int maxSoFar = A[0];// ĿǰΪֹ���ҵ������ֵ
        int curMin = A[0];
		int minSoFar = A[0];
        
        for(int i=1; i<A.length; ++i){
            total += A[i];
            curMax = Math.max(curMax + A[i], A[i]); // ���curMax+A[i] < A[i]��Ҳ�������curMax < 0���ͽ�curMax����Ϊ��ǰԪ�ص�ֵ
            maxSoFar = Math.max(maxSoFar, curMax);  // ���curMax����maxSoFar���͸���maxSoFar��ֵ����ȷ��maxSoFar��¼���ǵ�ǰ�ҵ������������
            curMin = Math.min(curMin + A[i], A[i]);
            minSoFar = Math.min(minSoFar, curMin);
        }
        return maxSoFar>0 ? Math.max(maxSoFar, total-minSoFar) : maxSoFar;
    }
}