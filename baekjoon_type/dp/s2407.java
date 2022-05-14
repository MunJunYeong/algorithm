package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class s2407 {
	
//	static int n;
	static BigInteger dp[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		dp = new BigInteger[n+1][m+1];
		System.out.println(find(n , m));
		
	}
	private static BigInteger find(int n, int r) {
		if(n == r || r== 0) return new BigInteger("1");
		if(dp[n][r] != null) {
			return dp[n][r];
		}
		return dp[n][r] = find(n-1, r-1).add(find(n-1, r));
	}


}