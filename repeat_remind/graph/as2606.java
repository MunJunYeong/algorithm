package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class as2606 {
	
	static int n;
	static int m;
	
	static int[][] arr;
	static boolean visit[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		System.out.println(dfs(1));
		
	}
	private static int dfs(int start) {
		int cnt = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visit[start] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			for(int i = 1; i <=n; i++) {
				if(arr[temp][i] == 1 && !visit[i]) {
					q.add(i);
					cnt ++;
					visit[i] = true;
				}
			}
		}
		return cnt;
	}


}