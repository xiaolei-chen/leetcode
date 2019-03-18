class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int count = 0;
        int start = -1;
        int last = -1;
        for(int i=0; i<A.length; ++i){
            if(A[i]>R){
                start = last = i;
                continue;
            }
            if(A[i]>=L){
                last = i;
            }
            count += last-start;
        }
        return count;
    }
}