package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class virus8{
	int x;
	int y ;
	public virus8(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class a8 {
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[][] ;
	
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = Integer.MIN_VALUE;
	static Queue<virus8> q= new LinkedList<virus8>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N ���� , M ����
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visit = new boolean[N][M];
		
		//0�� ��ĭ 1�� �� 2�� ���̷���
		for(int i = 0 ; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M ; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0);
		System.out.println(res);
		
	}
	private static void dfs(int dep) {
		if(dep == 3) {
			bfs(0); return;
		}
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < M ; j++) {
				if(arr[i][j] == 0) {
					arr[i][j] = 1;
					dfs(dep+1);
					arr[i][j] = 0;
				}
			}
		}
		
	}
	private static void bfs(int a) {
		int [][] temp = new int[N][M];
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < M ; j++) {
				temp[i][j] = arr[i][j];
				if(arr[i][j] == 2) {
					q.add(new virus8(i, j));
					visit[i][j]  = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			virus8 t = q.poll();
			for(int i =0; i < 4; i ++) {
				int dx = t.x + xArr[i];
				int dy = t.y + yArr[i];
				if(dx >=0 && dy >= 0 && dx < N && dy < M) {
					if(temp[dx][dy] ==0 && !visit[dx][dy]) {
						temp[dx][dy] = 2;
						visit[dx][dy] = true;
						q.add(new virus8(dx, dy));
					}
				}
			}
		}
		for(boolean ab[] : visit) {
			Arrays.fill(ab, false);
		}
		int cnt = 0;
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < M ; j++) {
				if(temp[i][j] == 0) {
					cnt ++;
				}
			}
		}
		res = Math.max(cnt, res);
	}
}

	
	

