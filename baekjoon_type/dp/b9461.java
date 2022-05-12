package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b9461 {

	static long[] dp;
	static int arr[];
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		while(n--> 0) {
			int a= Integer.parseInt(br.readLine());
			dp = new long[a+1];
			dp[0] = 0; 
			dp[1] = 1;
			if(a>=2) {dp[2] = 1;};
			for(int i = 3; i < a+1; i++) {
				dp[i] = dp[i-2] + dp[i-3];
			}
			System.out.println(dp[a]);
		}
		
	}
}

	
	


