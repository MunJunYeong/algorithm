package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class a7 {
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static boolean visit[];
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = 0;
	static Queue<virus8> q= new LinkedList<virus8>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr= new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i =1; i < M+1; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a=  Integer.parseInt(st1.nextToken());
			int b=  Integer.parseInt(st1.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		for(int i = 1; i < N+1; i++) {
			if(visit[i]) {
			}else {
				dfs(i);
				res++;
			}
		}
		System.out.println(res);
		
	}
	private static void dfs(int a) {
		visit[a] = true;
		for(int i = 1; i < N+1; i++) {
			if(arr[a][i] == 1 && !visit[i]) {
				dfs(i);
			}
		}
		
	}

}

	
	


