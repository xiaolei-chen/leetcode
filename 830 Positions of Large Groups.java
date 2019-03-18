class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        int end = 0;
        int start = 0;
        while(end<S.length()){
            while(end<S.length() && S.charAt(start)==S.charAt(end)){
                end++;
            }
            if (end-start>=3){
                res.add(Arrays.asList(start,end-1));
            }
            start = end;
        }
        return res;
    }
}