package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class s1463 {
	
	static int n;
	static int[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		dp[1] = 0;
		
		findDp(n);
		System.out.println(dp[n]);
	}
	private static int findDp(int n) {
		if(dp[n] == Integer.MAX_VALUE) {
			if(n % 6 == 0) {
				dp[n] = Math.min(findDp(n/3), Math.min(findDp(n/2), findDp(n-1))) +1;
			}else if(n % 3 == 0) {
				dp[n] = Math.min(findDp(n/3), findDp(n-1))+1;
			}else if(n % 2 == 0) {
				dp[n] = Math.min(findDp(n/2), findDp(n-1))+1;
			}else {
				dp[n] = findDp(n-1) +1;
			}
			
		}
		return dp[n];
		
	}

}