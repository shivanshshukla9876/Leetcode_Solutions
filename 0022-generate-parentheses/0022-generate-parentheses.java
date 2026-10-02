class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans =new ArrayList<>();
            generate("",0,0,n,ans);

           return ans ;
    }
    static void generate(String current, int open,int close,int n,List<String> ans){
        if(current.length()==2*n){
            ans.add(current);
            return;
        }
        if(open<n){
           generate(current +"(",open+1,close,n,ans);
        }
        if(close<open){
            generate(current + ")",open,close+1,n,ans);
        }

    }
}