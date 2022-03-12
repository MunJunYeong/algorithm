package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


class DotB3{
	int x;
	int y;
	public DotB3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class b3 {
	static int N;
	static char normal[][];
	static char abNormal[][];
	
	static boolean visit[][];
	static boolean visit2[][];
	
	static int[] xArr = {-1, 1, 0, 0};
	static int[] yArr = {0, 0, -1, 1};
	
	
	// R G B - --> R == G
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		normal = new char[N][N];
		abNormal = new char[N][N];
		visit = new boolean[N][N];
		visit2 = new boolean[N][N];
		
		for(int i = 0 ; i < N ; i++) {
			String s = br.readLine();
			for(int j =0; j < s.length(); j++) {
				char c = s.charAt(j);
				normal[i][j] = c;
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j =0; j < N; j++) {
				char c = normal[i][j];
				if(c == 'R' || c == 'G') {
					abNormal[i][j] = 'R';
				}else {
					abNormal[i][j] = c;
				}
				
			}
		}
		int cnt = 0;
		for(int i =0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visit[i][j]) {
					findNormal(i , j);
					cnt ++;
				}
			}
		}
		int cnt2 =0;
		for(int i =0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visit2[i][j]) {
					findAbNormal(i , j);
					cnt2 ++;
				}
			}
		}
		System.out.println(cnt + " " + cnt2);
		
	}

	private static void findAbNormal(int a, int b) {
		char c= abNormal[a][b];
		Queue<DotB3> q = new LinkedList<DotB3>();
		visit2[a][b] = true;
		q.add(new DotB3(a, b));
		while(!q.isEmpty()) {
			DotB3 dot = q.poll();
			for(int i = 0; i < 4; i ++) {
				int dx=  dot.x + xArr[i];
				int dy = dot.y + yArr[i];
				if(dx >= 0 && dy >= 0 && dx < N && dy <N) {
					if(abNormal[dx][dy] == c && !visit2[dx][dy]) {
						visit2[dx][dy] = true;
						q.add(new DotB3(dx, dy));
					}
				}
			}
		}
	}

	//dfs
	private static void findNormal(int a, int b) {
		char c= normal[a][b];
		Queue<DotB3> q = new LinkedList<DotB3>();
		visit[a][b] = true;
		q.add(new DotB3(a, b));
		while(!q.isEmpty()) {
			DotB3 dot = q.poll();
			for(int i = 0; i < 4; i ++) {
				int dx=  dot.x + xArr[i];
				int dy = dot.y + yArr[i];
				if(dx >= 0 && dy >= 0 && dx < N && dy <N) {
					if(normal[dx][dy] == c && !visit[dx][dy]) {
						visit[dx][dy] = true;
						q.add(new DotB3(dx, dy));
					}
				}
			}
		}
	}

}

	
	


