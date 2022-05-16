package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s11055 {
	
	static int s, n;
	static int[] dp;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		for(int i = 1; i <n; i++) {
			dp[i] = arr[i];
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					dp[i] = Math.max(dp[j]+arr[i], dp[i]);
				}
			}
			
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
