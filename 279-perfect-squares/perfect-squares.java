class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for(int i = 1; i<=n; i++){
            dp[i]=i;
            for(int j = 1; j*j <=i; j++){
                int square  = j*j;
                dp[i] = Math.min(dp[i], dp[i-square]+1);
            }
        }
        return dp[n];
    }
}