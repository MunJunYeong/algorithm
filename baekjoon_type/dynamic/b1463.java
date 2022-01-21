package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1463 {
	static Integer[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp = new Integer[n+1];
		dp[0] = dp[1] = 0;
		System.out.println(recur(n));
		
	}
	private static int recur(int n) {
		for(int i = 2; i < dp.length; i++) {
			dp[i] =  dp[i-1] + 1;
			System.out.println(i + " " + dp[i]);
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] +1);
			}
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] +1);
			}
		}
		return dp[n];
	}
}
