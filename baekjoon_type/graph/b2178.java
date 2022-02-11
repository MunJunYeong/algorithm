package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location{
	int row, col;
	Location(int r, int c){
		this.row = r;
		this.col = c;
	}
}

public class b2178 {
	static int n;
	static int m;
	static int start;
	static int map[][];
	static int visit[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 세로 
		m = Integer.parseInt(st.nextToken()); // 가로 
		
		map = new int[n+1][m+1];
		visit = new int[n+1][m+1];
		for(int i = 1; i < n+1; i++) {
			String s = br.readLine();
			for(int  j = 1; j < m+1; j++) {
				map[i][j] = s.charAt(j-1) - '0';
			}
		}
		bfs();
	}

	private static void bfs() {
		Queue<Location> q = new LinkedList<Location>();
		q.add(new Location(1, 1));
		//상우하좌 
		int[] xArr = {-1, 0, 1, 0};
        int[] yArr = {0, 1, 0, -1};
        visit[1][1] = 1;
		
        while(!q.isEmpty()) {
        	Location location = q.poll();
        	int row= location.row;
        	int col = location.col;
        	
        	for(int i =0; i<4; i++) {
        		int x = row+xArr[i];
        		int y = col+yArr[i];
        		if(checkLocation(x,y)) {
        			q.add(new Location(x, y));
        			visit[x][y] = visit[row][col] +1;
        		}
        	}
        	
        }
        System.out.println(visit[n][m]);
        
	}

	private static boolean checkLocation(int row, int col) {
		// node가 범위 밖의 경우일
		if(row <1 || row > n || col <1 || col > m) {
			return false;
		}
		// 이미 방문한 노드일 경우 
		if(visit[row][col] != 0 || map[row][col] == 0) {
			return false;
		}
		return true;
	}

}

	
	

	


