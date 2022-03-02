package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot1 {
	int x;
	int y;
	public Dot1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class a1 {
	static int N, M;
	
	static int arr[][];
	static boolean visit[][];
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visit = new boolean[N][M];
		
		
		for(int i = 0; i< N; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = s.charAt(j) -'0';
			}
		}
		
		bfs(0, 0);
		
		
	}

	private static void bfs(int x, int y) {
		visit[x][y] = true;
		Queue<Dot1> q= new LinkedList<Dot1>();
		q.add(new Dot1(x, y));
		
		while(!q.isEmpty()) {
			Dot1 d = q.poll();
			for(int i = 0; i < 4; i++) {
				int dx = d.x + xArr[i];
				int dy = d.y + yArr[i];
				if(dx >=0 && dy >= 0 && dx < N && dy < M) {
					if(!visit[dx][dy] && arr[dx][dy] == 1) {
						visit[dx][dy] = true;
						q.add(new Dot1(dx ,dy));
						arr[dx][dy] = arr[d.x][d.y] +1;
					}
				}
			}
		}
		System.out.println(arr[N-1][M-1]);
		
		
	}




}

	
	


	
	

