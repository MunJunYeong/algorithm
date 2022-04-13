package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s2606 {
	
	static int vertex;
	static int edge;
	static int [][] arr;
	static boolean visit[];
	static int res = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		vertex = Integer.parseInt(br.readLine());
		edge = Integer.parseInt(br.readLine());
		arr = new int[vertex+1][vertex+1];
		visit = new boolean[vertex+1];
		
		for(int i = 0; i < edge; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		dfs(1);
		System.out.println(res);
	}

	private static void dfs(int a) {
		visit[a] =true;
		
		for(int i = 2; i <=vertex; i++) {
			if(!visit[i] && arr[a][i] == 1) {
				res++;
				dfs(i);
			}
		}
		
		
		
	}

	
	
}

	
	


