package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s9465 {
	
	static int s, n;
	static long[][] dp;
	static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			int m = Integer.parseInt(br.readLine());
			arr = new int[2][m+1];
			dp = new long[2][m+1];
			for(int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 1; j <= m; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			
			for(int i = 2; i <= m; i++) {
				dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + arr[0][i];
				dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + arr[1][i];
			}
			System.out.println(Math.max(dp[0][m], dp[1][m]));
		}
		
	}

}
