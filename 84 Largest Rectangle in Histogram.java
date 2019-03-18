class Solution { //http://www.cnblogs.com/lichen782/p/leetcode_Largest_Rectangle_in_Histogram.html
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>(); //只存放单调递增的索引
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);
            if(s.isEmpty() || h >= heights[s.peek()]){ //栈内元素一定是要比当前i指向的元素小
                s.push(i);
            }else{
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i-1-s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}