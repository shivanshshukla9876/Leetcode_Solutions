class Solution {
    public int climbStairs(int n) {
        return climb(n,new int[n+1]);
    }
    private int climb(int n,int[] memo){
        if(n<=2){
            return n;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        return memo[n] = climb(n-1,memo) + climb(n-2,memo);
    }
}