class Solution { // [3,3,5,0,0,3,1,4]   6
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        //local[i][j]Ϊ�ڵ����i��ʱ���ɽ���j�ν��ײ������һ�ν��������һ��������������󣬴�Ϊ�ֲ�����
        int[] local = new int[3];
        //global[i][j]Ϊ�ڵ����i��ʱ���ɽ���j�ν��׵�������󣬴�Ϊȫ������
        int[] global = new int[3];
        for(int i=0; i<prices.length-1; i++){
            int diff = prices[i+1] - prices[i];
            for(int j=2; j>=1; j--){
                //��һ����ȫ�ֵ�i-1�����j-1�ν��ף����������׬Ǯ�Ļ������Ͻ���Ľ��ס��ڶ�������ȡlocal��i-1��j�ν��ף�Ȼ����Ͻ���Ĳ�ֵ
                local[j] = Math.max(global[j-1] + (diff > 0 ? diff : 0), local[j] + diff);
                //ȡ��ǰ�ֲ���õģ��͹���ȫ����õ��д���Ǹ������һ�ν������������ǰ��һ���ھֲ���õ����棬����һ���ڹ���ȫ�����ŵ����棩
                global[j] = Math.max(local[j], global[j]);
            }
        }
        return global[2];
    }
}