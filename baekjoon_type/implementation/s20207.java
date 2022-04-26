package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s20207 {
	
	static int n, s, e;
	static int[][] arr;
	static int[][] train;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int dp [] = new int[367];
		while(n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			for(int i = s; i<=e;i++) {
				dp[i] ++;
			}
		}
		
		int ans = 0;
		int height = 0;
		int width = 0;
		for(int i = 1; i <367; i++) {
			if(dp[i] > 0) {
				height ++;
				width = Math.max(width, dp[i]);
			}else {
				ans += (width*height);
				width= 0;
				height = 0;
				
			}
		}
		System.out.println(ans);

		
		
	}
}