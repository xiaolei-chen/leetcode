class Solution {
    public int maxSubarraySumCircular(int[] A) { // -2, 1, -3, 4, -1, 2, 1, -5, 4
        int total = A[0];
        int curMax = A[0];// 包含当前元素的最大值
		int maxSoFar = A[0];// 目前为止所找到的最大值
        int curMin = A[0];
		int minSoFar = A[0];
        
        for(int i=1; i<A.length; ++i){
            total += A[i];
            curMax = Math.max(curMax + A[i], A[i]); // 如果curMax+A[i] < A[i]，也就是如果curMax < 0，就将curMax更新为当前元素的值
            maxSoFar = Math.max(maxSoFar, curMax);  // 如果curMax大于maxSoFar，就更新maxSoFar的值，以确保maxSoFar记录的是当前找到的数组的最大和
            curMin = Math.min(curMin + A[i], A[i]);
            minSoFar = Math.min(minSoFar, curMin);
        }
        return maxSoFar>0 ? Math.max(maxSoFar, total-minSoFar) : maxSoFar;
    }
}