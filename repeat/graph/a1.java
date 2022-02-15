package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Spot{
	int x;
	int y;
	public Spot(int x, int y) {
		this.x= x;
		this.y= y;
	}
}

public class a1 {
	static int M;
	static int N;
	
	static int map[][];
	static boolean visit[][];
	
	static int [] xArr = {1, -1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		visit = new boolean[M][N];
		
		for(int i = 0; i < M; i++) {
			String s=  br.readLine();
			for(int j =0; j < N; j++) {
				int temp = s.charAt(j) - '0';
				visit[i][j] = false;
				map[i][j] = temp;
			}
		}
		bfs(0, 0);
		
		System.out.println(map[M-1][N-1]);
	}

	private static void bfs(int a, int b) {
		Queue<Spot> q = new LinkedList<Spot>();
		visit[a][b] = true;
		q.offer(new Spot(a,b));
		
		while(!q.isEmpty()) {
			Spot l = q.poll();
			for(int i = 0; i < 4; i++) {
				int dx = l.x + xArr[i];
				int dy = l.y + yArr[i];
				if(dx >=0 && dy >= 0 && dx < M && dy < N) {
					if(!visit[dx][dy] && map[dx][dy] ==1) {
						q.offer(new Spot(dx, dy));
						visit[dx][dy] = true;
						map[dx][dy] = map[l.x][l.y]+1;
					}
				}
				
			}
		}
		
	}
}