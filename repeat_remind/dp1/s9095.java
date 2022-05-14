package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s9095 {
	
	static int n;
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new int[12];
		while(n-- > 0) {
			int temp = Integer.parseInt(br.readLine());
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			dp[4] = 7;
			for(int i = 5; i <= temp; i++) {
				dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
			}
			System.out.println(dp[temp]);
		}
		
		/*
		0 -> 0
		1 -> 1
		2 -> 2
		3 -> 4
		4-> 7
		5 -> 13
		*/
	}


}