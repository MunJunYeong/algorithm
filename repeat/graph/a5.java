package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato5{
	int x;
	int y ;
	public Tomato5(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class a5 {
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[][];
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = 0;
	static Queue<Tomato5> q= new LinkedList<Tomato5>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < N ; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st2.nextToken());
				if(arr[i][j] == 1) {
					q.add(new Tomato5(i, j));
					visit[i][j] = true;
				}
			}
		}
		
		bfs();
		for(int i = 0; i < N ; i++) {
			for(int j = 0; j < M ; j++) {
				if(arr[i][j] == 0) {
					res = -1;
				}
			}
		}
		if(res == -1 || res == 0) {
			System.out.println(res);
		}else {
			System.out.println(res-1);
		}
		
	}
	private static void bfs() {
		while(!q.isEmpty()) {
			Tomato5 t= q.poll();
			for(int i = 0; i < 4; i++) {
				int dx = t.x + xArr[i];
				int dy = t.y + yArr[i];
				if(dx >=0 && dy >= 0 && dx < N && dy < M) {
					if(arr[dx][dy] == 0 && !visit[dx][dy]) {
						visit[dx][dy] = true;
						arr[dx][dy] = arr[t.x][t.y] + 1;
						q.add(new Tomato5(dx, dy));
						res = Math.max(arr[dx][dy], res);
					}
				}
			}
		}
	}

}

	
	

