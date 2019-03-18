class Solution {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<Integer>();
        int i = 0;
        int n = height.length;
        int res = 0;
        while (i < n) {
            if (s.isEmpty() || height[i] <= height[s.peek()]) { //如果此时栈为空，或者当前高度小于等于栈顶高度
                //把当前高度的坐标压入栈,注意我们不直接把高度压入栈，而是把坐标压入栈，这样方便我们在后来算水平距离
                s.push(i);
                i++;
            } else { //当前高度比栈顶高度大的时候，就说明有可能会有坑存在
                int t = s.pop();
                //如果只有一个的话，那么不能形成坑
                if (s.isEmpty()) continue;
                //如果多余一个的话，那么此时把栈顶元素取出来当作坑，新的栈顶元素就是左边界，当前高度是右边界
                //只要取二者较小的，减去坑的高度，长度就是右边界坐标减去左边界坐标再减1，二者相乘就是盛水量啦
                res += (Math.min(height[i], height[s.peek()]) - height[t]) * (i - s.peek() - 1); 
            }
        }
        return res;
    }
}