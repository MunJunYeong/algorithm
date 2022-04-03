package dynamic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b1904 {

	static int[] dp;
	static int [] arr;
	static int n;
	static int west;
	static int east;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
			
		arr = new int[n+1];
		dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1 % 15746;
		if(n >= 2) {
			dp[2] = 2 % 15746;
		}
		System.out.println(findRes(n));
		
		
	}
	private static int findRes(int a) {
		if(dp[a] > 0 || a == 0) {
			return dp[a];
		}else {
			dp[a] = (findRes(a-1) + findRes(a-2)) % 15746;
			return dp[a];
		}
		
		
	}
}

	
	

