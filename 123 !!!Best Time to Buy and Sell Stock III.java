class Solution { // [3,3,5,0,0,3,1,4]   6
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        //local[i][j]为在到达第i天时最多可进行j次交易并且最后一次交易在最后一天卖出的最大利润，此为局部最优
        int[] local = new int[3];
        //global[i][j]为在到达第i天时最多可进行j次交易的最大利润，此为全局最优
        int[] global = new int[3];
        for(int i=0; i<prices.length-1; i++){
            int diff = prices[i+1] - prices[i];
            for(int j=2; j>=1; j--){
                //第一个是全局到i-1天进行j-1次交易，如果今天是赚钱的话，加上今天的交易。第二个量是取local第i-1天j次交易，然后加上今天的差值
                local[j] = Math.max(global[j-1] + (diff > 0 ? diff : 0), local[j] + diff);
                //取当前局部最好的，和过往全局最好的中大的那个（最后一次交易如果包含当前天一定在局部最好的里面，否则一定在过往全局最优的里面）
                global[j] = Math.max(local[j], global[j]);
            }
        }
        return global[2];
    }
}