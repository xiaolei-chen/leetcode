class Solution { // 32,57,24,19,0,24,49,67,87,87    答案为7
    public int partitionDisjoint(int[] A) {
        int leftMax = A[0];
        int max = A[0];
        int index = 0;
        for(int i=1; i<A.length; ++i){
            if(A[i]<leftMax){
                index = i; // left数组包含第i+1个数
                leftMax = max; // 当前最大值在index左边，即当前最大值为左边最大值
            }else{
                max = Math.max(max, A[i]);
            }
        }
        return index+1;
    }
}