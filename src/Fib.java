public class Fib {
    public int fib(int n) {
        if (n <= 1) return n;
        int [] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int index = 2; index <=n; index++) {
            dp[index] = dp[index-1]+dp[index-2];
        }
        return dp[n];
    }
}
