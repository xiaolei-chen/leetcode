class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        backtrack(res, list, 1, n ,k);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> list, int start, int n, int k){
        if(k == 0){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=start; i<=n; ++i){
            list.add(i);
            backtrack(res, list, i+1, n ,k-1);
            list.remove(list.size()-1);
        }
    }
}