class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1;
        int res = 0;
        for(int i=0; i<flowerbed.length; ++i){
            if(flowerbed[i] == 0){
                count++;
            }else{
                res += (count-1)/2;
                count = 0;
            }
        }
        if(count != 0){
            res += count/2;
        }
        return res >= n;
    }
}