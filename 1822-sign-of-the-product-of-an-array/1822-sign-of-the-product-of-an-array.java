class Solution {
    public int arraySign(int[] nums) {
        int negative =0;
       for(int n: nums){
     if(n ==0){
        return 0;
       } 
       else if (n <0){
       negative++;
       }
       }
       if(negative %2 == 0){
        return 1;
       }
       return -1;
    }
}