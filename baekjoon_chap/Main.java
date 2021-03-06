import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Dot {
	int x;
	int y;
	public Dot(int x, int y) {
		this.x =x;
		this.y = y;
	}
}

public class Main {

	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr=  {0, 0, -1, 1};
	
	static int n;
	static int m;
	static int v;
	
	static int[][] arr;
	static boolean visit[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visit = new boolean[n][m];
		for(int i = 0; i < n;i++) {
			String s = br.readLine();
			for(int j = 0; j< m; j++) {
				arr[i][j] = s.charAt(j)- '0';
			}
		}
		bfs(0, 0);
		System.out.println(arr[n-1][m-1]);
	}
	
	private static void bfs(int x, int y) {
		Queue<Dot> q = new LinkedList<Dot>();
		q.add(new Dot(x, y));
		visit[x][y] = true;
		while(!q.isEmpty()) {
			Dot dot = q.poll();
			for(int i = 0; i < 4; i++) {
				int dx = xArr[i] + dot.x;
				int dy= yArr[i] + dot.y;
				if(dx < n && dy < m && dx >=0 && dy >= 0) {
					if(!visit[dx][dy] && arr[dx][dy] == 1) {
						visit[dx][dy] = true;
						q.add(new Dot(dx, dy));
						arr[dx][dy] = arr[dot.x][dot.y] + 1;
					}
				}
			}
		}
	}


}