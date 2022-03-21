package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class a2 {

	static int[] dp;
	static int max = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		
		Arrays.fill(dp, max);
		dp[0] = dp[1] = 0;
		System.out.println(dyna(n));
		
	}

	private static int dyna(int n) {
		if(dp[n] == max) {
			if(n% 6 == 0) {
				dp[n] = Math.min(dyna(n-1), Math.min(dyna(n/3), dyna(n/2))) + 1;
			}else if(n%3 ==0) {
				dp[n] = Math.min(dyna(n/3), dyna(n-1))+1;
			}else if(n%2 ==0) {
				dp[n] = Math.min(dyna(n/2), dyna(n-1))+1;
			}else {
				dp[n] = dyna(n-1) +1;
			}
		}
		
		return dp[n];
	}
}

	
	

