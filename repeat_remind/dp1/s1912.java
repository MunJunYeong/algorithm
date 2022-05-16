package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s1912 {
	
	static int s, n;
	static int[] dp;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		arr = new int[n];
		dp = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i <n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max = Integer.MIN_VALUE;
		dp[0] = arr[0];
		max = dp[0];
		for(int i = 1; i < n;i++) {
			dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		
		System.out.println(max);
		
	}

}