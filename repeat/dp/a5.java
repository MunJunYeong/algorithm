package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a5 {

	static Integer[] dp;
	
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp = new Integer[n+2];
		dp[0] = 0;
		dp[1] = 1;
		if(n>1) {
			dp[2] = 2;
		}
		if(n>2) {
			dp[3] = 3;
		}
		if(n>3) {
			dp[4] = 5;
		}
		find(n);
		
		System.out.println(dp[n]);
	}
	private static int find(int n) {
		if(dp[n] == null) {
			dp[n] = (find(n-1) + find(n-2)) % 10007;
		}
		return dp[n];
		
	}
}

	
	

