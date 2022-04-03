package dynamic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b2293 {

	static int[] dp;
	static int [] arr;
	static int n, k;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		dp = new int[k+1];
		for(int i = 1; i <=n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		
		for(int i = 1; i <=n; i++) {
			for(int j = 1; j <= k; j++) {
				if(j >= arr[i]) {
					dp[j] = dp[j] + dp[j - arr[i]];
				}
			}
		}
		
		System.out.println(dp[k]);
		
		
	}
}

	
	

