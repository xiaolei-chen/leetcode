class Solution {
    public int maxChunksToSorted(int[] arr) { // 当前位置出现过的最大值小于等于之后还未遍历到的最小值时，就能拆出新块儿
        int n = arr.length;
        int[] maxOfLeft = new int[n]; // 已经遍历过的最大值
        int[] minOfRight = new int[n]; // 还未遍历的到的最小值
        int res = 1;
        
        maxOfLeft[0] = arr[0];
        for(int i=1; i<n; ++i){
            maxOfLeft[i] = Math.max(maxOfLeft[i-1], arr[i]);
        }
        
        minOfRight[n-1] = arr[n-1];
        for(int i=n-2; i>=0; --i){
            minOfRight[i] = Math.min(minOfRight[i+1], arr[i]);
        }
        
        for(int i=0; i<n-1; ++i){
            if(maxOfLeft[i] <= minOfRight[i+1]){
                res++;
            }
        }
        return res;
    }
}