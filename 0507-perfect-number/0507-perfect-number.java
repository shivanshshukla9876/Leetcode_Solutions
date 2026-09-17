class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum =0;
       if(num <=1){
        return false;
       }
        for(int i=1; i<num ; i++){
            if(num % i == 0){
                sum+=i;
            }
        }
       
        return num == sum;
    }
}