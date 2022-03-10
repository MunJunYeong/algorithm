package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class DotB1 {
	int x;
	int y;
	DotB1(int x, int y){
		this.x = x;
		this.y = y;
	}
}



public class b1 {
	static int N, M;
	
	
	static int arr[][];
	static boolean visit[][] ;
	
	static int[] xArr = {-1, -1, -1, 0, 0, 0, 1, 1, 1 };
	static int[] yArr = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 너비 높이 순  N = 세로
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			if(M == 0 && N == 0) break;
			
			arr = new int[N+1][M+1];
			//1 땅 /2 바다
			for(int i = 1; i < N+1; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1; j< M+1; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			visit = new boolean [N+1][M+1];
			int cnt = 0;
			for(int i = 1; i < N+1; i++) {
				for(int j = 1; j< M+1; j++) {
					if(!visit[i][j] && arr[i][j] == 1) {
						dfs(i, j); 
						cnt ++;
					}
				}
			}
			System.out.println(cnt);
			
		}
	}


	private static void dfs(int a, int b) {
		Queue<DotB1> q=  new LinkedList<DotB1>();
		visit[a][b] = true;
		q.add(new DotB1(a, b));
		while(!q.isEmpty()) {
			DotB1 d= q.poll();
			for(int i = 0; i < 9; i++) {
				int dx = d.x + xArr[i];
				int dy = d.y + yArr[i];
				if(dx >= 0 && dy >= 0 && dx < N+1 && dy < M+1) {
					if(!visit[dx][dy] && arr[dx][dy] == 1) {
						visit[dx][dy] = true;
						q.add(new DotB1(dx, dy));
					}
				}
			}
		}
	}
}

	
	


