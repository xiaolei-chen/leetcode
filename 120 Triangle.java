class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                int self = triangle.get(i).get(j); //获取第（i+1）行（j+1）个数字
                int res = Math.min(triangle.get(i+1).get(j) + self, 
                                   triangle.get(i+1).get(j+1) + self); //得到这一行与下一行相邻数的和的最小值
                triangle.get(i).set(j,res); //更新第（i+1）行第（j+1）个数字
            }
        }
        return triangle.get(0).get(0); //返回第一行第一个数字，也就是最小值
    }
}