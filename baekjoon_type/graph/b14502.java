package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot14502{
	int x;
	int y;
	public Dot14502(int x, int y) {
		this.x= x;
		this.y = y;
	}
}

public class b14502 {
	static int N;
	static int M;
	
	static int map[][];
	static int copyMap[][];
	
	static boolean visit[][];
	
	static int [] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	static int result = Integer.MIN_VALUE;
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
//		copyMap = new int[N][M];
		
		for(int i = 0; i < N ; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			for(int j = 0; j < M ; j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
//		copyMap =  map;
		
		dfs(0);
		System.out.println(result);
	}
	private static void dfs(int depth) {
		if(depth == 3) {
			bfs(); return;
		}
		for(int i = 0; i < N ; i++) {
			for(int j = 0;  j< M; j++) {
				
				if(map[i][j] == 0) {
					map[i][j] = 1;
					dfs(depth +1);
					map[i][j]= 0;
				}
				
				
			}
		}
		
		
	}
	private static void bfs() {
		int virus[][] =  new int[N][M];
		Queue<Dot14502> q = new LinkedList<Dot14502>();
		
		for(int i = 0; i < N ; i++) {
			for(int j = 0 ; j <M; j++) {
				virus[i][j] = map[i][j];
			}
		}
		for(int i = 0; i < N ; i++) {
			for(int j = 0 ; j <M; j++) {
				if(virus[i][j] == 2) {
					q.add(new Dot14502(i, j));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Dot14502 d= q.poll();
			for(int i = 0; i < 4; i ++) {
				int dx  = d.x + xArr[i];
				int dy = d.y + yArr[i];
				if(dx >= 0  && dy >= 0 && dx < N && dy < M) {
					if(virus[dx][dy] == 0) {
						virus[dx][dy] = 2;
						q.add(new Dot14502(dx, dy));
					}
				}
			}
		}
		safe(virus);
		
	}
	private static void safe(int[][] virus) {
		int cnt = 0;
		for(int i = 0; i < N ; i++) {
			for(int j = 0; j < M; j++) {
				if(virus[i][j] == 0) {
					cnt ++;
				}
			}
		}
		result = Math.max(result, cnt);
	}

}

	
	

