package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class DotB2{
	int x;
	int y ;
	public DotB2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class b2 {
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[][] ;
	
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int max = Integer.MIN_VALUE;
	static int res = Integer.MIN_VALUE;
	static Queue<DotB2> q= new LinkedList<DotB2>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		
		arr=  new int[N][N];
		
		
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		while(max-- > 0) {
			visit = new boolean[N][N];
			int[][] temp = arr;
			for(int i = 0 ; i < N; i++) {
				for(int j = 0; j < N ; j++) {
					if(temp[i][j] <= max) {
						visit[i][j] = true;
					}
				}
			}
			int cnt = 0;
			for(int i = 0; i < N; i ++) {
				for(int j = 0; j < N; j++) {
					if(!visit[i][j]) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			res = Math.max(cnt, res);
		}
		System.out.println(res);
		
	}
	private static void bfs(int a, int b) {
		visit[a][b] = true;
		q.add(new DotB2(a, b));
		
		while(!q.isEmpty()) {
			DotB2 t = q.poll();
			for(int i = 0; i < 4; i++) {
				int dx = t.x+ xArr[i];
				int dy= t.y + yArr[i];
				if(dx>=0 && dy >= 0 && dx < N && dy < N) {
					if(!visit[dx][dy]) {
						visit[dx][dy] = true;
						q.add(new DotB2(dx, dy));
					}
				}
			}
		}
		
	}
}

	
	


