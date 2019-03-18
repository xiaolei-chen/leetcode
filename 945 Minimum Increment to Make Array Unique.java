class Solution {
    public int minIncrementForUnique(int[] A) {
        if(A.length==0){
            return 0;
        } 
        Arrays.sort(A);
        int res = 0;
        int need = A[0];
        for(int i=1; i<A.length; ++i){
            need = Math.max(need+1, A[i]);
            res += need - A[i];
        }
        return res;
    }
}