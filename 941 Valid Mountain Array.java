class Solution {
    public boolean validMountainArray(int[] A) {
        int len = A.length;
        int index = 0;
        if(len < 3){
            return false;
        }
                for(int i=0; i<len-1; ++i){
            if(A[i] < A[i+1]){
                index++;
            }
        }
        if(index == 0 || index == len-1)
            return false;
        for(int i=index; i<len-1; ++i){
            if(A[i] <= A[i+1]){
                return false;
            }
        }
        return true;
    }
}