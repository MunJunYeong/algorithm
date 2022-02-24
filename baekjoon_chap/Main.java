import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	static int arr[];
	static boolean result[];
	static int N;
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			if(N == 0) break;
			arr = new int[N];
			result = new boolean[N];
			for(int i = 0; i < N ; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			dfs(0, 0);
			System.out.println();
		}
		
	}
	private static void dfs(int start, int depth) {
		if(depth == 6) {
			for(int i = 0; i < N; i++) {
				if(result[i]) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
		for(int i = start; i < N ; i++ ) {
			result[i] = true;
			dfs(i+1, depth+1);
			result[i]= false;
		}
		
	}
	
	
}