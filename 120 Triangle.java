class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                int self = triangle.get(i).get(j); //��ȡ�ڣ�i+1���У�j+1��������
                int res = Math.min(triangle.get(i+1).get(j) + self, 
                                   triangle.get(i+1).get(j+1) + self); //�õ���һ������һ���������ĺ͵���Сֵ
                triangle.get(i).set(j,res); //���µڣ�i+1���еڣ�j+1��������
            }
        }
        return triangle.get(0).get(0); //���ص�һ�е�һ�����֣�Ҳ������Сֵ
    }
}