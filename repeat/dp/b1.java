package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b1 {

	static int[] dp;
	static int arr[];
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		dp = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = arr[0];
		for(int i = 1; i < n; i ++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		System.out.println(max);
		
		
	}
}

	
	


