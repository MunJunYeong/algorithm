package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class as1260 {
	
	static int n;
	static int m;
	static int v;
	
	static int[][] arr;
	static boolean visit[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
//		for(int i = 1; i < n+1; i++) {
//			
//		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		dfs(v);
		System.out.println();
		Arrays.fill(visit, false);
		bfs(v);
		
	}
	private static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visit[start] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp + " ");
			for(int i = 1; i <=n; i++) {
				if(arr[temp][i] == 1 && !visit[i]) {
					q.add(i);
					visit[i] = true;
				}
			}
		}
		
		
	}
	private static void dfs(int start) {
		System.out.print(start +  " ");
		visit[start] =true;
		for(int i = 1; i <= n; i++) {
			if(arr[start][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
		
	}


}