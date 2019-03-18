class Solution { // O(n) 贪心
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = nums.length;
        int res = len + 1;
        while(right < len){
            while(sum < s && right < len){ //直到子数组和大于等于给定值或者right达到数组末尾
                sum += nums[right];
                right++;
            }
            while(sum >= s){
                res = Math.min(res, right-left);
                sum -= nums[left];
                left++;
            }
        }
        return (res == len + 1) ? 0 : res;
    }
}




class Solution { // O(nlogn) 二分
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        int[] sums = new int[n+1]; 
        for(int i=1; i<n+1; ++i){ //二分法需要有序数组。这里让数组变得有序
            sums[i] = sums[i-1] + nums[i-1]; //sums[i]表示nums数组中[0, i-1]的和
        }
        for(int i=0; i<n; ++i){ //寻找右边界
            int left = i + 1;
            int right = n;
            int t = sums[i] + s;  //只需要判断当前的值加上s等于后面的哪个值，就可以得出后面的值的下标
            while(left <= right){ //右边界是sums[right] >sums[left] + s的值
                int mid = left + (right - left) / 2;
                if(sums[mid] < t){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            if (left == n + 1) break;
            res = Math.min(res, left - i);
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}