class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;
        int max=0;

        for(int num:piles){
            if(num>max){
                max=num;
            }
            right =max;
        }
        while (left <= right) {
            long hours = 0;

            int mid = left + (right - left) / 2;
            for(int i = 0; i < piles.length; i++) {
            hours += (piles[i] + mid - 1) / mid;
            }
                 if (hours <= h) {
                     right =mid-1;
                } else {
                left=mid+1;
        }
     }
        return left;
    }
}