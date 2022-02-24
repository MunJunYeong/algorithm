package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b6603 {
	
	static int N;
	static int []arr;
	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			if(N == 0) break;
			
			arr = new int[N];
			visit = new boolean[N];
			
			for(int i = 0; i < N ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			dfs(0, 0);
			System.out.println();
		}
		
	}

	private static void dfs(int start, int dep) {
		if(dep == 6) {
			for(int i = 0; i < N; i++) {
				if(visit[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
		
		
		for(int i = start; i< N; i++) {
			visit[i] = true;
			dfs(start+1, dep+1);
			visit[i] = false;
		}
		
		
		
		
	}
}
