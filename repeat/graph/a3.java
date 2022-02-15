package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class a3 {
	static int vertex;
	static int edge;
	
	static int map[][];
	static boolean visit[];
	
	static int [] xArr = {1, -1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		vertex = Integer.parseInt(br.readLine());
		edge = Integer.parseInt(br.readLine());
		
		map = new int[vertex+1][vertex+1];
		visit = new boolean[vertex+1];
		
		for(int i = 0; i < edge ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a=  Integer.parseInt(st.nextToken());
			int b=  Integer.parseInt(st.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}
		// no 1. 
		
		dfs(1);
		int cnt = 0;
		for(int i = 2; i < vertex+1; i++) {
			if(visit[i]) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}


	private static void dfs(int start) {
		Queue<Integer> q= new LinkedList<Integer>();
		visit[start]= true;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			for(int i = 1; i < vertex+1; i ++) {
				if(map[temp][i] == 1 && !visit[i]) {
					q.offer(i);
					visit[i] = true;
				}
			}
		}
	}

	
	
	

}