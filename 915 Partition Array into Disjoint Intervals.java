class Solution { // 32,57,24,19,0,24,49,67,87,87    ��Ϊ7
    public int partitionDisjoint(int[] A) {
        int leftMax = A[0];
        int max = A[0];
        int index = 0;
        for(int i=1; i<A.length; ++i){
            if(A[i]<leftMax){
                index = i; // left���������i+1����
                leftMax = max; // ��ǰ���ֵ��index��ߣ�����ǰ���ֵΪ������ֵ
            }else{
                max = Math.max(max, A[i]);
            }
        }
        return index+1;
    }
}