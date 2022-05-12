package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b1699 {

	static int[] dp;
	static int [] arr;
	static int n, k;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());

		dp = new int[n+1];
		
		for(int i =1; i <=n;i++) {
			dp[i] = i;
		}
		
		for(int i = 1; i <=n; i++) {
			
			for(int j =1; j*j <=i; j++) {
				if(dp[i] > dp[i-(j*j)]+1) {
					dp[i] = dp[i-(j*j)]+1;
				}
			}
			
		}
		
		
		System.out.println(dp[n]);
		
		
	}
}

	
	


