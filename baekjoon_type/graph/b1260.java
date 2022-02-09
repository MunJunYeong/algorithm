package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b1260 {
	static int n; // 정점의 개수 
	static int m; // 간선의 개수 
	static int v; // 시작 정점의 번호 
	static int[][] map; //간선 연결상태
	static boolean[] visit; 
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		map = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i =0; i <n +1; i++) {
			Arrays.fill(map[i], 0);
		}
		Arrays.fill(visit, false);
		
		for(int i = 0; i < m; i ++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			// 방향이 없을 경우에는 둘다 1로 해주고 방향이 존재할 경우에는 아래를 1로 하지않는다. 
			map[a][b] = 1;
			map[b][a] = 1;
		}
		dfs(v);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(v);


		
	}
	
	
	public static void dfs (int i) {
		visit[i] = true;
		System.out.print(i + " ");
		for(int  j =1 ; j <n+1; j++) {
			if(map[i][j] ==1 && !visit[j]) {
				dfs(j);
			}
		}
	}
	public static void bfs (int i ) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(i);
		visit[i] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp +" ");
			for(int j=1; j<=n; j++) {
				if(map[temp][j] == 1 && !visit[j]) {
					q.offer(j);
					visit[j] = true;
				}
			}
			
		}
		
		
	}

	
}

