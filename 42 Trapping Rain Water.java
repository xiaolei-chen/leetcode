class Solution {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<Integer>();
        int i = 0;
        int n = height.length;
        int res = 0;
        while (i < n) {
            if (s.isEmpty() || height[i] <= height[s.peek()]) { //�����ʱջΪ�գ����ߵ�ǰ�߶�С�ڵ���ջ���߶�
                //�ѵ�ǰ�߶ȵ�����ѹ��ջ,ע�����ǲ�ֱ�ӰѸ߶�ѹ��ջ�����ǰ�����ѹ��ջ���������������ں�����ˮƽ����
                s.push(i);
                i++;
            } else { //��ǰ�߶ȱ�ջ���߶ȴ��ʱ�򣬾�˵���п��ܻ��пӴ���
                int t = s.pop();
                //���ֻ��һ���Ļ�����ô�����γɿ�
                if (s.isEmpty()) continue;
                //�������һ���Ļ�����ô��ʱ��ջ��Ԫ��ȡ���������ӣ��µ�ջ��Ԫ�ؾ�����߽磬��ǰ�߶����ұ߽�
                //ֻҪȡ���߽�С�ģ���ȥ�ӵĸ߶ȣ����Ⱦ����ұ߽������ȥ��߽������ټ�1��������˾���ʢˮ����
                res += (Math.min(height[i], height[s.peek()]) - height[t]) * (i - s.peek() - 1); 
            }
        }
        return res;
    }
}