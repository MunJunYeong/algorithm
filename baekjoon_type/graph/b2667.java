package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class b2667 {
	static int [] xArr = {-1, 1, 0, 0};
	static int [] yArr = {0, 0, -1, 1};
	
	static int n;
	static int apartsNum = 0;
	static int [] aparts = new int[25*25];

	static int map[][];
	static boolean [][] visit;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visit = new boolean[n][n];

		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < n ; j ++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(map[i][j] ==1 && !visit[i][j]) {
					apartsNum ++;
					dfs(i , j);
				}
			}
		}
		Arrays.sort(aparts);
		System.out.println(apartsNum);
		for(int i = 0; i < aparts.length; i++) {
			if(aparts[i] == 0) {
				
			}else 
			System.out.println(aparts[i]);
		}
	}

	private static void dfs(int x, int y) {
		visit[x][y] = true;
		aparts[apartsNum]++;
		
		for(int i = 0; i< 4; i++) {
			int dx = x + xArr[i];
			int dy = y + yArr[i];
			if(dx >=0 && dy>=0 && dx < n && dy < n) {
				if(map[dx][dy] == 1 && !visit[dx][dy]) {
					dfs(dx, dy);
				}
			}
		}
		
	}


        

}

	
	

	

