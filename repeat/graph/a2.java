package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class b2667Location{
	int x;
	int y;
	public b2667Location(int x, int y) {
		this.x= x;
		this.y= y;
	}
}

public class a2 {
	static int N;
	
	static int map[][];
	static boolean visit[][];
	
	static int [] xArr = {1, -1, 0, 0};
	static int[] yArr = {0,0, -1, 1};
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();
	static int cnt = 0; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i ++) {
			String s = br.readLine();
			for(int j = 0; j < N ; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0; j < N ; j++) {
				if(map[i][j] == 1 && !visit[i][j]) {
					cnt = 1;
					bfs(i, j);
					arr.add(cnt);
				}
			}
		}
		System.out.println(arr.size());
		Collections.sort(arr);
		for(int i = 0 ; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

	private static void bfs(int x, int y) {
		Queue<b2667Location> q = new LinkedList<>();
		q.offer(new b2667Location(x, y));
		visit[x][y] = true;
		
		while(!q.isEmpty()) {
			b2667Location l = q.poll();
			for(int i = 0; i < 4; i++) {
				int dx = l.x + xArr[i];
				int dy = l.y + yArr[i];
				if(dx >=0 && dy >= 0 && dx < N && dy < N) {
					if(map[dx][dy] == 1 && !visit[dx][dy]) {
						visit[dx][dy] = true;
						q.offer(new b2667Location(dx, dy));
						cnt ++;
					}
				}
			}
		}
		
	}
	
	
	
	
	

}
