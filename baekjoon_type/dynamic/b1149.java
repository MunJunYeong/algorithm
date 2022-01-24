package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1149 {
	static int red = 0;
	static int green = 1;
	static int blue = 2;
	static int cost[][];
	static int dp[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		cost = new int[n][3];
		dp = new int[n][3];
		
		for(int i = 0 ; i <n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cost[i][red] = Integer.parseInt(st.nextToken());//R
			cost[i][green] = Integer.parseInt(st.nextToken());//G
			cost[i][blue] = Integer.parseInt(st.nextToken());//B
		}
		dp[0][red] = cost[0][red];
		dp[0][green] = cost[0][green];
		dp[0][blue] = cost[0][blue];
		System.out.println(Math.min(findRGB(n-1, red), Math.min(findRGB(n-1, green), (findRGB(n-1, blue)))));
		
		
//		for(int i = 1 ; i <n; i++) {
//			cost[i][r] += Math.min(cost[i-1][b], cost[i-1][g]);
//			cost[i][g] += Math.min(cost[i-1][r], cost[i-1][b]);
//			cost[i][b] += Math.min(cost[i-1][r], cost[i-1][g]);
//		}
//		System.out.println(Math.min(cost[n-1][r], Math.min(cost[n-1][g], cost[n-1][b])));
		
	}

	private static int findRGB(int n, int color) {
		if(dp[n][color] ==0) {
			if(color == red) {
				dp[n][red] = Math.min(findRGB(n-1, green), findRGB(n-1, blue)) + cost[n][red];
			}else if(color == green) {
				dp[n][green] = Math.min(findRGB(n-1, red), findRGB(n-1,blue)) + cost[n][green];
			}else {
				dp[n][blue] = Math.min(findRGB(n-1, red), findRGB(n-1,green)) + cost[n][blue];
			}
		}
		return dp[n][color];
	}
}
