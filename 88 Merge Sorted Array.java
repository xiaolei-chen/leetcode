class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
		int j = n-1;
		int k = m+n-1;
		while(i >=0 && j >= 0){
			if(nums1[i] > nums2[j]){ //比较A和B中最后一个元素的大小
				nums1[k] = nums1[i]; //把较大的那个插入到m+n-1的位置上，再依次向前推
                --k;
                --i;
            }else{
				nums1[k] = nums2[j];
                --k;
                --j;
            }
		}
		while(j >= 0){ //如果A中的数组比B大的，当A循环完了，B中还有元素没加入A
			nums1[k] = nums2[j]; //直接用个循环把B中所有的元素覆盖到A剩下的位置
            --k;
            --j;
        }
    }
}