package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class a6 {
	static int N, M;
	static int vertex, edge;
	
	static int arr[][];
	static int visit[] ;
	
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	static int res = 0;
//	static Queue<Tomato5> q= new LinkedList<Tomato5>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visit = new int[100001];
		if(N == M) {
			System.out.println(0);
		}else {
			bfs(N);
		}
		
	}
	private static void bfs(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		visit[n] = 1;
		
		while(!q.isEmpty()) {
			int p = q.poll();
			for(int i = 0; i < 3; i ++) {
				int next;
				if(i == 0) {
					next = p+1;
				}else if(i == 1) {
					next = p-1;
				}else {
					next = p*2;
				}
				if(next == M) {
					System.out.println(visit[p]); return;
				}
				if(next >= 0 &&  next < visit.length && visit[next] == 0) {
					q.add(next);
					visit[next] = visit[p] +1;
				}
			}
		}
		
	}

}

	
	


