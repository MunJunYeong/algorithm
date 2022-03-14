package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot7562{
	int x;
	int y ;
	public Dot7562(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class b7562 {
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[][] ;
	
	static int[] xArr = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int[] yArr = {-2, -1, 1, 2, -2, -1, 1, 2};
	
	static int x1, x2, y1, y2;
	
	static Queue<Dot7562> q= new LinkedList<Dot7562>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		while(n -- > 0) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			visit = new boolean[N][N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			x1= Integer.parseInt(st.nextToken());
			y1= Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			x2= Integer.parseInt(st.nextToken());
			y2= Integer.parseInt(st.nextToken());
			
			bfs(x1, y1);
			System.out.println(arr[x2][y2]);
			
		}
	}
	private static void bfs(int x1, int y1) {
		Queue<Dot7562> q= new LinkedList<Dot7562>();
		if(x1 == x2 && y1 == y2) {
			return;
		}
		visit[x1][y1] = true;
		q.add(new Dot7562(x1, y1));
		while(!q.isEmpty()) {
			Dot7562 t = q.poll();
			for(int i = 0; i < 8; i++) {
				int dx = t.x + xArr[i];
				int dy = t.y + yArr[i];
				if(dx >= 0 && dy >= 0 && dx < N && dy < N) {
					if(!visit[dx][dy]) {
						visit[dx][dy] = true;
						q.add(new Dot7562(dx, dy));
						arr[dx][dy] = arr[t.x][t.y]+1;
					}
				}
			}
		}
		
		
	}
}

	
	

