package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2156 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];
		for(int i =1; i <= n; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[1] = arr[1];
		if(n >= 2) {
			dp[2] = arr[1]+arr[2];
		}
		
		for(int i = 3; i<=n; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2], dp[i-3]+arr[i-1])+ arr[i]) ;
		}
		
		int max= 0;
		for(int i = 1; i <= n; i++) {
			if(dp[i] > max) {
				max = dp[i];
			}
		}
		System.out.println(max);
	}
}


