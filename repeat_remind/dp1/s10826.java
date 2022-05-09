package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class s10826 {
	
	static int n;
	static BigInteger dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		dp = new BigInteger[n+1];
		dp[0] = BigInteger.ZERO;
		if(n >0) {
			dp[1] = BigInteger.ONE;
		}
		for(int i = 2; i <=n; i++) {
			BigInteger b = dp[i-1];
			BigInteger b1 = dp[i-2];
			dp[i] = b.add(b1);
		}
		System.out.println(dp[n]);
	}

}
