class Solution {
    public int[] constructArray(int n, int k) {
    	int[] ret = new int[n];
    	int left = 1;
        int right = n;
        int i = 0;
    	for(i=0; i<k; i++) {
    		if(i % 2 == 0){
                ret[i] = left++;
            }else{
                ret[i] = right--;
            }
    	}
    	
    	if(i % 2 == 1){
    		for(int j=left; j<=right; j++){
                ret[i++] = j;
            }
        }else{
    		for(int j=right; j>=left; j--){
                ret[i++] = j;
            }
        }
    	return ret;
    }
}
