class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] arr : A) {
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                arr[left] ^= 1;
                arr[right] ^= 1;
                left++;
                right--;
            }
             if (left == right) {
                arr[left] ^= 1;
            }
        }
        return A;
    }
}