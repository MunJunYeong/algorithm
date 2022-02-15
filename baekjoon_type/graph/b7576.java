package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Tomato7576{
	int x;
	int y;
	public Tomato7576(int x, int y) {
		this.x= x;
		this.y = y;
	}
}

public class b7576 {
	static int M;
	static int N;
	
	static int map[][];
	static boolean visit[][];
	
	static int [] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	static Queue<Tomato7576> q = new LinkedList<Tomato7576>();
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < N ; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
				if(map[i][j] == 1) {
					q.offer(new Tomato7576(i, j));
				}
			}
		}
		System.out.println(bfs());
		
	}


	private static int bfs() {
		while(!q.isEmpty()) {
			Tomato7576 dot = q.poll();
			int x = dot.x;
			int y = dot.y;
			for(int i = 0; i < 4; i++) {
				int dx = x + xArr[i];
				int dy = y + yArr[i];
				if(dx >=0 && dy >=0 && dx < N && dy < M) {
					if(map[dx][dy] == 0) {
						q.offer(new Tomato7576(dx, dy));
						map[dx][dy] = map[x][y] +1;
					}
				}
			}
		}
		int res = Integer.MIN_VALUE;
		for(int i = 0 ; i< N ; i++) {
			for(int j = 0; j < M ; j++) {
				if(map[i][j] == 0) {
					return -1;
				}
				res = Math.max(res, map[i][j]);
			}
		}
		if(res == 0) {
			return 1;
		}else 
			return res-1;
	}



	
	
	

}