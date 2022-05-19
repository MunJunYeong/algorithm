package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s15486 {
	
	static int s, n;
	static int[] t;
	static int[] m;
	static int[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		t= new int[n+2];
		m= new int[n+2];
		dp= new int[n+2];
		
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			m[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = Integer.MIN_VALUE;

		for(int i = 1; i <n+2 ; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
			int next = i + t[i];
			if(next < n+2) {
				dp[next] = Math.max(dp[next], max+m[i]);
			}
		}
		System.out.println(max);
		
	}

}
