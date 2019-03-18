class Solution {
    public int divide(int dividend, int divisor) {
	    int sign = 1;
	    if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
	    	sign = -1;
	    long ldividend = Math.abs((long) dividend);
	    long ldivisor = Math.abs((long) divisor);
	    if (ldivisor == 0) return Integer.MAX_VALUE;
	    if ((ldividend == 0) || (ldividend < ldivisor))	return 0;
	    long lres = ldivide(ldividend, ldivisor);
	    int res;
	    if (lres > Integer.MAX_VALUE){ //Handle overflow.
	    	res = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
	    } else {
	    	res = (int) (sign * lres);
	    }
	    return res;
    }

    private long ldivide(long ldividend, long ldivisor) {
	    // Recursion exit condition
	    if (ldividend < ldivisor) return 0;
	    //  Think this as a binary search.
	    long sum = ldivisor;
	    long multiple = 1;
	    while ((sum+sum) <= ldividend) {
		    sum += sum;
		    multiple += multiple;
	    }
	    return multiple + ldivide(ldividend - sum, ldivisor);
    }
}