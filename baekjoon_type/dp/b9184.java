package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b9184 {
	
	static int dp[][][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp = new int[21][21][21];
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			int ans = find(a, b, c);
			System.out.println("w(" + a + ", " + b + ", " + c + ") = " + ans);
		}
		
	}

	private static int find(int a, int b, int c) {
		if( checkRange(a, b, c) &&dp[a][b][c] != 0 ) {
			return dp[a][b][c];
		}
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		if(a > 20 || b > 20 || c > 20) {
			return dp[20][20][20] = find(20, 20, 20);
		}
		if(a < b && b < c) {
			return dp[a][b][c] = find(a, b, c-1) + find(a, b-1, c) - find(a, b-1, c);
		}
		return dp[a][b][c] = find(a-1, b, c) + find(a-1, b-1, c) + find(a-1, b, c-1) -find(a-1, b-1, c-1);
		
	}

	private static boolean checkRange(int a, int b, int c) {
		return a >=0 && a <=20 && b >=0 && b <=20 && c >=0 && c <=20;
	}
}