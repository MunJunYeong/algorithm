package dynamic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b9465 {

	static int[][] dp;
	static int [][] arr;
	static int c;
	static int west;
	static int east;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		c = Integer.parseInt(br.readLine());
		
		while(c-- > 0) {
			n = Integer.parseInt(br.readLine());
			
			arr = new int[2][n+1];
			dp = new int[2][n+1];
			
			for(int i = 0; i <2; i ++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j= 1; j <= n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			
			for(int i= 2; i <= n; i++) { // 2 : dp[1][1] 
				dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + arr[0][i];
				dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + arr[1][i];
			}
			
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
		
	}
}

	
	


