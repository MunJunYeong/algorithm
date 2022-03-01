package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b1987 {
	static int N, M;
	
	static int arr[][];
	static boolean visit[] = new boolean[26];
	
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				char c = s.charAt(j);
				arr[i][j] = c - 'A'; 
			}
		}
		
		dfs(0, 0, 0);
		System.out.println(res);
	}


	private static void dfs(int x, int y, int cnt) {
		if(visit[arr[x][y]]) {
			res =Math.max(res, cnt);
			return;
		}else {
			visit[arr[x][y]] =  true;
			for(int i = 0; i < 4; i++) {
				int dx = x + xArr[i];
				int dy = y + yArr[i];
				if(dx >= 0 && dy >= 0 && dx < N && dy < M) {
					dfs(dx, dy, cnt +1);
				}
			}
			visit[arr[x][y]]= false;
		}
	}


}

	
	

