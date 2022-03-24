package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b2 {

	static int[] dp;
	static int arr[];
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n+1];
		dp = new int[n+1];
		for(int i = 1; i < n+1; i ++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = arr[1];
		if(n >=2) {
			dp[2] = arr[1] + arr[2];
		}
		
		for(int i = 3; i < n+1; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i]);
		}
		int max = 0;
		for(int i = 1; i < n+1; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
		
	}
}

	
	


