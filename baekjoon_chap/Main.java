import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot{
	int x;
	int y;
	public Dot(int x, int y) {
		this.x= x;
		this.y = y;
	}
}

public class Main {
	static int N;
	static int K;
	
	static int map[][];
	
	static int [] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	
	static int check[] = new int[100001];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=  new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); //subin
		K = Integer.parseInt(st.nextToken()); //sister
		
		if(N == K) {
			System.out.println(0);
		}else {
			bfs(N);
		}
		
		
	}

	private static void bfs(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(n);
		check[n] = 1;
		
		while(!q.isEmpty()) {
			int qPoll = q.poll();
			for(int i = 0; i < 3; i++) {
				int next;
				if(i == 0) {
					next = qPoll+1;
				}else if(i == 1) {
					next = qPoll-1;
				}else {
					next = qPoll * 2;
				}
				
				if(next == K) {
					System.out.println(check[qPoll]); return;
				}
				if(next >= 0 && next < check.length && check[next] ==0) {
					q.add(next);
					check[next] = check[qPoll] +1;
				}
				
				
			}
			
			
		}
		
	}





	
	
	

}