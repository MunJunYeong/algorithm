import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
	static int w;
	static int h;
	
	static int map[][];
	static boolean visit[][];
	
	static int [] xArr = {-1, -1, -1, 0, 0, 1 , 1, 1};
	static int[] yArr = {-1, 0, 1, -1, 1, -1, 0, 1};
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			if(w == 0 && h == 0) break;
			map = new int[h+1][w+1];
			visit = new boolean[h+1][w+1];
			for(int i = 1; i < h+1; i++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine());
				for(int j =1; j < w+1; j++) {
					map[i][j] = Integer.parseInt(st1.nextToken());
				}
			}
			int cnt =0;
			for(int i= 1; i < h+1; i++) {
				for(int j =1; j < w+1; j++) {
					if(map[i][j] == 1 && !visit[i][j]) {
						dfs(i , j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
			
		}
	}
	public static void dfs(int a , int b) {
		visit[a][b] = true;
		Queue<Dot> q = new LinkedList<Dot>();
		q.offer(new Dot(a, b));
		while(!q.isEmpty()) {
			Dot d = q.poll();
			for(int i = 0; i < 8 ; i++) {
				int dx = d.x + xArr[i];
				int dy = d.y + yArr[i];
				if(dx >= 0 && dy >= 0 && dx < h+1 && dy < w+1) {
					if(map[dx][dy] == 1 && !visit[dx][dy]) {
						q.offer(new Dot(dx, dy));
						visit[dx][dy] =true;
					}
				}
			}
		}
	}

}

	
	

