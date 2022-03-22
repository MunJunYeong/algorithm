package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a4 {

	static Integer[] dp;
	
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0) {
			int a = Integer.parseInt(br.readLine());
			
			dp = new Integer[11];
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			dp[4] = 7;
			find(a);
			System.out.println(dp[a]);
			
		}
		
	}
	private static int find(int a) {
		if(dp[a]==null) {
			dp[a] = find(a-1)+find(a-2)+find(a-3);
		}
		
		return dp[a];
		
	}
}

	
	


