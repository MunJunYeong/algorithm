package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot2583{
	int x;
	int y ;
	public Dot2583(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class b2583 {
	static int N, M, K;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[][] ;
	
	static int xA[] = {-1, 1, 0, 0};
	static int yA[] = {0, 0, -1, 1};
	
	static int cnt = 1;
	
	static Queue<Dot2583> q= new LinkedList<Dot2583>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		arr = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < N;i++) {
			for(int j =0; j < M; j++) {
				arr[i][j] = 0;
			}
		}
		
		for(int i =0; i < K ; i++) {
			st= new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int a = y1; a < y2; a++) {
				for(int b = x1; b < x2; b++) {
					arr[a][b] = 1;
				}
			}
		}
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i = 0; i < N;i++) {
			for(int j =0; j < M; j++) {
				if(!visit[i][j] && arr[i][j] == 0) {
					bfs(i, j);
					list.add(cnt);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(int i =0; i < list.size();i ++) {
			System.out.print(list.get(i)+ " ");
		}
		
		
	}
	private static void bfs(int a, int b) {
		cnt = 1;
		visit[a][b] = true;
		q.add(new Dot2583(a, b));
		
		while(!q.isEmpty()) {
			Dot2583 t = q.poll();
			for(int i = 0; i < 4; i++) {
				int dx = t.x + xA[i];
				int dy = t.y + yA[i];
				if(dx >= 0 && dy >= 0 && dx < N && dy <M) {
					if(!visit[dx][dy] && arr[dx][dy] == 0) {
						cnt++; q.add(new Dot2583(dx, dy));
						visit[dx][dy]= true;
					}
				}
			}
		}
		
	}
}

	
	

