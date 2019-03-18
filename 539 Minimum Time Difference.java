class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] mask = new boolean[24*60];
        int prev = 0;
        int first = Integer.MAX_VALUE, last = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String time: timePoints){
            String[] t = time.split(":");
            int h = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            if(mask[h*60+m]){
                return 0;
            }
            mask[h*60+m] = true;
        }
        for(int i=0; i<24*60; ++i){
            if(mask[i]){
                if(first != Integer.MAX_VALUE){
                    min = Math.min(min, i-prev);
                }
                first = Math.min(first, i);
                last = Math.max(last, i);
                prev = i;
            }
        }
        min = Math.min(min, 24*60-last+first); //考虑经过0点，到第二天的情况
        return min;
    }
}