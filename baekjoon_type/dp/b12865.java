package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b12865 {

	static int[][] dp;
	static int [][] arr;
	static int n, K;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); // Î¨ºÌíà?ùò ?àò 
		K = Integer.parseInt(st.nextToken()); // Î≤ÑÌã∏ ?àò ?ûà?äî Î¨¥Í≤å 
		
		arr = new int[n+1][2]; // [0] : weight , [1] : price
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dp = new int[n+1][K+1];
		
		for(int k = 1; k <=K; k++) {
			for(int i = 1; i <= n; i++) {
				dp[i][k] = dp[i-1][k];
				if(k-arr[i][0] >= 0) {
					dp[i][k] = Math.max(dp[i][k], arr[i][1] + dp[i-1][k- arr[i][0]  ] );
				}
			}
		}
		System.out.println(dp[n][K]);
		
	}
}

	
	

