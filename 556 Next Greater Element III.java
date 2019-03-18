class Solution {
    public int nextGreaterElement(int n) {
        String str = String.valueOf(n);
        char[] number = str.toCharArray();
        int i, j;
        for(i=number.length-1; i>0; --i){
            if(number[i-1] < number[i]){ //记录i-1
                break;
            }
        }
        if(i == 0){
            return -1;
        }
        for(j=number.length-1; j>=i; --j){
            if(number[j] > number[i-1]){
                swap(number, i-1 ,j);
                break;
            }
        }
        Arrays.sort(number, i, number.length); //下标为toIndex的元素不参与排序。即左闭右开
        long val = Long.parseLong(new String(number));
        return val<Integer.MAX_VALUE ? (int)val : -1;
    }
    
    private void swap(char[] number, int i, int j){
        char temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
}