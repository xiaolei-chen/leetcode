class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        combination(res, new ArrayList<Integer>(), k, 1, n);
        return res;
    }
    
    private void combination(List<List<Integer>> res, List<Integer> set, int k, int start, int n) {
        if(set.size() == k && n == 0){
            res.add(new ArrayList<Integer>(set));
            return;
        }
        for(int i=start; i<=9; i++){
            set.add(i);
            combination(res, set, k, i+1, n-i);
            set.remove(set.size() - 1);
        }
    }
}