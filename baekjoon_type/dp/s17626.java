package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s17626 {
	
	static int n;
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		dp[1] = 1;
		
		for(int i = 2; i<= n; i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j = 1; j*j <= i; j++) {
				int idx = i - (j*j);
				dp[i] = Math.min(dp[i], dp[idx]+1);
			}
		}
		System.out.println(dp[n]);
		
	}


}