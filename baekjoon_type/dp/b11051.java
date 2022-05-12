package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b11051 {

	static int[][] dp;
	static int [] arr;
	static int n, k;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		// nCk
		
		dp = new int[n+1][k+1];
		
		System.out.println(findRes(n, k) % 10007);
		
	}
	private static int findRes(int a, int b) {
		if(dp[a][b] > 0) {
			return dp[a][b];
		}
		if(a == b || b ==0) {
			return dp[a][b] = 1;
		}
		
		return dp[a][b]= (findRes(a-1, b-1) + findRes(a-1, b)) % 10007 ;
		
		
	}
}

	
	

