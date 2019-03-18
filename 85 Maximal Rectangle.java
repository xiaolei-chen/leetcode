class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;  
        int n = matrix[0].length;
        int[] heights = new int[n]; // using a array to reduce counting step of 1
        int max = 0;
        for(char[] row: matrix){
            for(int i=0; i<n; i++){
                if(row[i] == '1'){
                    heights[i] += 1;
                }else{
                    heights[i] = 0;
                }
            }
          max = Math.max(max, maxArea(heights)); // go a sub problem of Histogram
        }
        return max;
    }
    private int maxArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int area = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);
            if(s.isEmpty() || h >= heights[s.peek()]){
                s.push(i);
            }else{
                int tp = s.pop();
                area = Math.max(area, heights[tp] * (s.isEmpty() ? i : i-1-s.peek()));
                i--;
            }
        }
        return area;
    }
}