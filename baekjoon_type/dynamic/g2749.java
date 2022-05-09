package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class g2749 {
	
	static long n;
	static long dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int pisanoPeroid = 1500000;
		n = Long.parseLong(br.readLine());
		
		dp = new long[pisanoPeroid];
		dp[0] = 0;
		if(n >0) {
			dp[1] = 1;
		}
		
		
		for(int i = 2; i<pisanoPeroid&& i<=n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 1000000;
		}
		if(n >= pisanoPeroid) {
			n %= pisanoPeroid;
		}
		
		System.out.println(dp[(int) n]);
	}

}