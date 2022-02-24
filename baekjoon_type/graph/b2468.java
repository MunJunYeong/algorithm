package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot2468{
	int x;
	int y;
	public Dot2468(int x, int y) {
		this.x= x;
		this.y = y;
	}
}

public class b2468 {
	static int N;
	static int K;
	
	static int map[][];
	static int tempMap[][];
	static boolean visit[][];
	
	static int [] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	static int max = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		tempMap = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i =0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int temp =  Integer.parseInt(st.nextToken());
				map[i][j] = temp;
				if(temp >= max) {
					max = temp;
				}
			}
		}
		int res = 0;
		while(max-- > 0) {
			for(int i = 0; i < N; i++) {
				for(int j =0; j < N; j++) {
					int temp = map[i][j];
					if(temp > max) {
						tempMap[i][j] = 1;
					}else {
						tempMap[i][j]= 0;
					}
				}
			}
			int cnt = 0;
			for(int i =0; i< N; i++) {
				for(int j =0; j < N; j++) {
					if(!visit[i][j] && tempMap[i][j] == 1) {
						bfs(i, j);
						cnt ++;
					}
				}
			}
			for(int i =0; i < N ; i++) {
				for(int j = 0; j < N ; j++) {
					visit[i][j] = false;
				}
			}
//			System.out.println(max + " : "+ cnt);
			res = Math.max(res, cnt);
		}
		System.out.println(res);
	}


	private static void bfs(int a, int b) {
		visit[a][b] = true;
		Queue<Dot2468> q = new LinkedList<Dot2468>();
		q.offer(new Dot2468(a, b));
		
		while(!q.isEmpty()) {
			Dot2468 d= q.poll();
			for(int i = 0 ; i < 4; i++) {
				int dx = d.x+ xArr[i];
				int dy = d.y+ yArr[i];
				if(dx <N && dy < N && dx >=0 && dy >=0) {
					if(!visit[dx][dy] && tempMap[dx][dy] ==1) {
						visit[dx][dy] = true;
						
						q.offer(new Dot2468(dx, dy));
					}
				}
			}
				
			
		}
		
		
	}


}
