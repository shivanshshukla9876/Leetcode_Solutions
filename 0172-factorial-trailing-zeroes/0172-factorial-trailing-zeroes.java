class Solution {
    public int trailingZeroes(int n) {
        if(n<=0 && n<= 1){
            return 0;
        }
       
        long fact = 1;
       for(int i = n;i > 1;i--){
        fact = fact*i;
       }
       int count = 0 ;
       while(n >= 5) {
          n = n / 5;
         count = count + n;
      }

    return count;
  }
}