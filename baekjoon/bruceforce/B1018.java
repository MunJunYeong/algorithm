package bruceforce;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
	
	static boolean [][] arr;
	static int min  = 64;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j<m; j++) {
				if(str.charAt(j)=='W') {
					arr[i][j] = true;
				}else {
					arr[i][j] = false;
				}
			}
			
		}
		
		int nRow = n-7;
		int mCol = m-7;
		
		for(int i =0; i < nRow; i++) {
			for(int j =0; j<mCol;j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}

	private static void find(int x, int y) {
		int endX = x+8;
		int endY = y+8;
		int count = 0;
		boolean flag = arr[x][y];
		
		for(int i=x; i < endX; i++) {
			for(int j =y; j < endY; j++) {
				if(arr[i][j] != flag) {
					count++;
				}
				flag = (!flag);
			}
			flag = !flag;
		}
		count = Math.min(count, 64-count);
		min = Math.min(min, count);
	}
}

