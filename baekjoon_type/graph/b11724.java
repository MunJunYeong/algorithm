package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Dot11724{
	int x;
	int y;
	public Dot11724(int x, int y) {
		this.x= x;
		this.y = y;
	}
}

public class b11724 {
	static int vertex;
	static int edge;
	
	static int map[][];
	static boolean visit[];
	
	static int [] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		vertex = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		
		map = new int[vertex+1][vertex+1];
		visit=  new boolean[vertex+1];
		
		for(int i =0; i < edge; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st1.nextToken());
			int b= Integer.parseInt(st1.nextToken());
			map[a][b] = 1;
			map[b][a] = 1;
		}
		int cnt = 0;
		for(int i = 1;  i< vertex+1;i ++) {
			if(visit[i]) {
			}else {
				dfs(i);
				cnt ++;
			}
		}
		System.out.println(cnt);
		
	}
	private static void dfs(int start) {
		
		visit[start] = true;
		for(int i = 1; i < vertex+1; i++) {
			if(map[start][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
	}
}

	
	


