package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Cab4 {
	int x;
	int y;
	public Cab4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class a4 {
	static int N, M, K;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[][];
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		
		int test = Integer.parseInt(br.readLine());
		while(test -- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken()); // 배추 개수
			
			arr = new int[N][M];
			visit = new boolean[N][M];
			
			for(int i = 0; i < K ; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int a= Integer.parseInt(st2.nextToken());
				int b= Integer.parseInt(st2.nextToken());
				arr[b][a]  = 1;
			}
			int cnt =0;
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < M ; j++) {
					if(!visit[i][j] && arr[i][j] == 1 ) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			for(boolean temp[] : visit) {
				Arrays.fill(temp, false);
			}
		}
		
		
	}


	private static void bfs(int x, int y) {
		Queue<Cab> q = new LinkedList<Cab>();
		visit[x][y] = true;
		q.add(new Cab(x, y));
		while(!q.isEmpty()) {
			Cab d = q.poll();
			for(int i =0; i < 4; i++) {
				int dx = d.x + xArr[i];
				int dy = d.y + yArr[i];
				if(dx >=0 && dy >= 0 && dx < N && dy < M) {
					if(!visit[dx][dy] && arr[dx][dy] == 1) {
						visit[dx][dy] = true;
						q.add(new Cab(dx, dy));
					}
				}
			}
		}
	}
}

	
	

