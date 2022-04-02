package dynamic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b1010 {

	static int[][] dp;
	static int [][] arr;
	static int n;
	static int west;
	static int east;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			west = Integer.parseInt(st.nextToken());
			east = Integer.parseInt(st.nextToken());
			dp = new int[30][30];
			
			System.out.println(findRes(east, west));
		}
	}
	private static int findRes(int n, int r) {
		if(dp[n][r] > 0) {
			return dp[n][r];
		}else if(n == r || r ==0) {
			return dp[n][r] =1;
		}else {
			dp[n][r] = findRes(n-1, r-1) + findRes(n-1, r);
			return dp[n][r];
		}
		
	}
}

	
	


