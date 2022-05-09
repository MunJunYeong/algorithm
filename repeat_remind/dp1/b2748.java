package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2748 {
	
	static int n;
	static long dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		dp = new long[n+1];
		dp[0] = 0;
		if(n >0) {
			dp[1] = 1;
		}
		System.out.println(fibo(n));
		
	}
	private static Long fibo(int a) {
		if(a == 1 || a == 0) {
			return dp[a];
		}else if(dp[a] != 0) {
			return dp[a];
		}else {
			return dp[a] = fibo(a-1) + fibo(a-2);
		}
	}

}
