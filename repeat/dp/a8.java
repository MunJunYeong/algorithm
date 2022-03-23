package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class a8 {

	static int[] dp;
	static int arr[];
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dp = new int[n];
		
		for(int i = 0; i < n; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j] && dp[i] <= dp[j]) {
					dp[i] = dp[j]+1;
				}
			}
		}
		int max = 0;
		for(int i = 0; i < n; i++) {
			if(max <= dp[i]) {
				max = dp[i];
			}
		}
		
		System.out.println(max);
		
		
	}
}

	
	

