package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class s2156 {
	
	static int s, n;
	static int[] dp;
	static int[] t;
	static int[] p;
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		t = new int[n+1];
		dp = new int[n+1];
		
		for(int i = 1; i <=n; i++) {
			t[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = t[1];
		if(n >=2) {
			dp[2] = t[1]+ t[2];
		}
		
		for(int i = 3; i<=n; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2], dp[i-3]+t[i-1]) +t[i]);
		}
		int max = 0;
		for(int i = 1; i <=n;i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
		
	}

}