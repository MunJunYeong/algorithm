package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b1003 {

	static Integer[][] dp;
	
	static int zero;
	static int one;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			int a = Integer.parseInt(br.readLine());
			dp = new Integer[41][2];
			zero = 0; one = 0;
			dp[0][0]=1;
			dp[0][1] = 0;
			dp[1][0] = 0;
			dp[1][1] = 1;
			
			fibo(a);
			
			sb.append(dp[a][0]+" "+ dp[a][1]).append('\n');
		}
		System.out.println(sb);
		
	}
	private static Integer[] fibo(int a) {
		if(dp[a][0] == null || dp[a][1] == null) {
			dp[a][0] = fibo(a-1)[0] + fibo(a-2)[0]; 
			dp[a][1] = fibo(a-1)[1] + fibo(a-2)[1]; 
		}
		return dp[a];
		
		
		
	}
}

	
	

