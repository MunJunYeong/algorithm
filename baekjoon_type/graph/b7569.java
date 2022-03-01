package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Dot7569{
	int x;
	int y;
	int height;
	public Dot7569(int x, int y, int h) {
		this.x = x;
		this.y = y;
		this.height = h;
	}
}

public class b7569 {
	static int N, M, H;
	
	static int arr[][][];
	
	static int[] xArr = {-1, 1, 0, 0, 0 , 0};
	static int[] yArr = {0, 0, -1, 1, 0 , 0};
	static int[] hArr = {0, 0, 0, 0, -1, 1};
	static Queue<Dot7569> q = new LinkedList<Dot7569>();
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N 세로 , M 가로
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		arr = new int[H+1][N+1][M+1];
		for(int i = 1; i < H+1; i++) {
			for(int j = 1; j < N+1; j++) {
				StringTokenizer st1=  new StringTokenizer(br.readLine());
				for(int k = 1; k < M+1; k++) {
					arr[i][j][k] = Integer.parseInt(st1.nextToken());
					if(arr[i][j][k] == 1) {
						q.add(new Dot7569(k, j, i));
					}
				}
			}
		}
		System.out.println(bfs());
		
	
	}


	private static int bfs() {
		while(!q.isEmpty()) {
			
			Dot7569 dot = q.poll();
			for(int i = 0; i < 6; i++) {
				int dx = dot.x + xArr[i];
				int dy = dot.y + yArr[i];
				int dh = dot.height + hArr[i];
				if(checkLocation(dx, dy , dh)) {
					q.add(new Dot7569(dx, dy, dh));
					arr[dh][dy][dx] = arr[dot.height][dot.y][dot.x]+ 1;
				}
			}
		}
		int res = Integer.MIN_VALUE;
		for(int i = 1; i < H+1; i++) {
			for(int j = 1; j < N+1; j++) {
				for(int k = 1; k < M+1; k++) {
					if(arr[i][j][k] == 0) {
						return -1;
					}
					res = Math.max(res, arr[i][j][k]);
				}
			}
		}
		if(res == 1) return 0; 
		else return (res-1);
		
	}


	private static boolean checkLocation(int dx, int dy, int dh) {
		if(dx >= 1 && dy >= 1 && dh >= 1 && dx <= M && dy <= N && dh <= H  ) {
			if(arr[dh][dy][dx] == 0) return true;
		}
		return false;
	}

}

	
	

