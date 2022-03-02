package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2 {
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[];
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		vertex = Integer.parseInt(br.readLine());
		edge = Integer.parseInt(br.readLine());
		
		arr = new int[vertex+1][vertex+1];
		visit = new boolean[vertex+1];
		
		for(int i = 0; i < edge ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		dfs(1);
		
		System.out.println(res);
	}
	private static void dfs(int v) {
		visit[v] = true;
		for(int i = 1; i < vertex+ 1; i++) {
			if(!visit[i] && arr[v][i] == 1) {
				res++;
				dfs(i);
			}
		}
		
	}
}

	
	


