package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b1520 {
	
	static int xArr[] = {-1, 1, 0, 0};
	static int yArr[] = {0, 0, -1, 1};
	static int [][]arr, dp;
	static int N, M;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][M+1];
		dp = new int[N+1][M+1];
		
		for(int i =1; i <=N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <=M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j] = -1;
			}
		}
		
		System.out.println(dfs(1,1));
		
		
		
	}
	private static int dfs(int x, int y) {
		if(x == N && y == M) return 1;
		
		if(dp[x][y] != -1) return dp[x][y];
		
		dp[x][y] = 0;
		for(int i = 0; i < 4; i++) {
			int dx = x + xArr[i];
			int dy = y + yArr[i];
			
			if(dx < 1 || dy < 1 || dx > N || dy > M) continue;
			
			if(arr[x][y] > arr[dx][dy]) {
				dp[x][y] += dfs(dx, dy);
			}
		}
		
		
		return dp[x][y];
	}
}

	
	

