package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class s1260 {
	
	static int vertex;
	static int edge;
	static int start;
	static int [][] arr;
	static boolean visit[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		vertex = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		arr = new int[vertex+1][vertex+1];
		visit = new boolean[vertex+1];
		
		for(int i = 0; i < edge; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		dfs(start);
		
		System.out.println();
		Arrays.fill(visit, false);
		bfs(start);
		
	}

	private static void bfs(int a) {
//		System.out.print(a + " ");
		Queue<Integer> q = new LinkedList<Integer>();
		visit[a] = true;
		q.add(a);
		while(!q.isEmpty()) {
			int temp  = q.poll();
			System.out.print(temp + " ");
			for(int i = 1; i <=vertex; i++) {
				if(!visit[i] && arr[temp][i] == 1) {
					q.add(i);
					visit[i] = true;
				}
			}
		}
		
	}

	private static void dfs(int a) {
		System.out.print(a + " ");
		visit[a] =true;
		
		for(int i = 1; i <=vertex; i++) {
			if(!visit[i] && arr[a][i] == 1) {
				dfs(i);
			}
		}
		
		
		
	}

	
	
}

	
	

