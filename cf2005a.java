import java.util.Scanner;

public class cf2005a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0 ) {
            int n= sc.nextInt();
            String vowels = "aeiou", s= "";
            for(int i=0; i<5; ++i) {
                for(int j=0; j < n / 5 + (i < n % 5 ? 1 : 0); ++j) {
                    s+= vowels.charAt(i);
                }
            }
            System.out.println(s);
        }
    }
}

public class Solution {
    public long maxScore(int[] a, int[] b) {
        int n = b.length;
        long[][] dp = new long[5][n + 1];
        for (int i= 0; i<= n; ++i) {
            dp[0][i] = 0;
        }
        for (int i= 1; i<= 4; ++i) {
            for (int j = i; j <= n; ++j) {
                dp[i][j] = Math.max(dp[i][j- 1], dp[i- 1][j- 1] + (long) a[i- 1]* b[j- 1]);
            }
        }
        return dp[4][n];
    }
}