package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot{
	int x;
	int y;
	public Dot(int x, int y) {
		this.x= x;
		this.y = y;
	}
}

public class a4 {
	static int M;
	static int N;
	static int K;
	
	static int map[][];
	static boolean visit[][];
	
	static int [] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	
	static int cnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		while(num-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			map = new int[M][N];
			visit = new boolean[M][N];
			
			for(int i = 0; i < K; i ++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				int a= Integer.parseInt(st1.nextToken());
				int b= Integer.parseInt(st1.nextToken());
				map[a][b] = 1;
			}
			cnt = 0;
			for(int i = 0; i < M ; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 1 && !visit[i][j]) {
						search(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
//			Arrays.fill(visit, false);
		}
		
	}
	private static void search(int a, int b) {
		visit[a][b] = true;
		Queue<Dot11724> q = new LinkedList<Dot11724>();
		q.offer(new Dot11724(a, b));
		
		while(!q.isEmpty()) {
			Dot11724 dot = q.poll();
			for(int i = 0; i < 4 ; i ++) {
				int dx = dot.x + xArr[i];
				int dy = dot.y + yArr[i];
				if(dx < M && dy < N && dx >= 0 && dy >= 0) {
					if(!visit[dx][dy] && map[dx][dy] ==1) {
						q.offer(new Dot11724(dx, dy));
						visit[dx][dy]=  true;
					}
				}
			}
		}
		
	}



	
	
	

}
