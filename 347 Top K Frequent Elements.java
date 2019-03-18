class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        // corner case: if there is only one number in nums, we need the bucket has index 1.
        List<Integer>[] bucket = new List[nums.length+1];
        for(int n:map.keySet()){
            int freq = map.get(n);
            if(bucket[freq]==null)
                bucket[freq] = new LinkedList<>();
            bucket[freq].add(n);
        }
        
        List<Integer> res = new LinkedList<>();
        for(int i=bucket.length-1; i>0 && k>0; --i){
            if(bucket[i]!=null){
                List<Integer> list = bucket[i]; 
                res.addAll(list);
                k-= list.size();
            }
        }
        
        return res;
    }
}

/*
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
	    List<Integer>[] bucket = new List[nums.length + 1];
	    Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

	    for (int n : nums) {
		    frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
	    }

	    for (int key : frequencyMap.keySet()) {
		    int frequency = frequencyMap.get(key);
		    if (bucket[frequency] == null) {
			    bucket[frequency] = new ArrayList<>();
		    }
		    bucket[frequency].add(key);
	    }

	    List<Integer> res = new ArrayList<>();

	    for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
		    if (bucket[pos] != null) {
			    res.addAll(bucket[pos]);
		    }
	    }
	    return res;
    }
}
*/