package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1010 {
	
	static int n;
	static int dp[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			dp = new int[31][31];
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			System.out.println(combi(b, a));
		}
		
	}
	private static int combi(int n, int r) {
		if(dp[n][r] > 0) {
			return dp[n][r];
		}
		if(n == r || r==0 ) return dp[n][r] = 1;
		return dp[n][r] = combi(n-1,r-1) + combi(n-1, r);
	}

}