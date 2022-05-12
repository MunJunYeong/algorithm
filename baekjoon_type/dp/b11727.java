package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b11727 {

	static long[] dp;
	static int arr[];
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp  = new long[n+1];
		
		dp[0] =0;
		dp[1] = 1;
		if(n >=2) {
			dp[2]  =3;
		}
		for(int i = 3; i < n+1; i++) {
			dp[i] = (dp[i-1] + (dp[i-2]*2)) % 10007;
		}
		System.out.println(dp[n]);
		
	}
}

	
	


