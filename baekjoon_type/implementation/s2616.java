package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class s2616 {
	
	static int n, k;
	static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr = new int[20][20];
		
		for(int i  = 1; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < 20; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int i  = 1; i < 20; i++) {
			for(int j = 1; j < 20; j++) {
				if(arr[i][j] != 0) {
					find(i, j, arr[i][j]);
				}
			}
		}
		
		System.out.println(0);
		
	}
	private static void find(int y, int x, int no) {
		//오른쪽 (y fix, x x+1 ~x+4)
		if(x+4 < 20) {
			if(searchRight(y, x, no) == no) {
				print(y, x, no);
			}
		}
		//아래 
		if(y+4 < 20) {
			if(searchDown(y, x, no) == no) {
				print(y, x, no);
			}
		}
		// 오른쪽아래 
		if(x+4 < 20 && y+4 < 20) {
			if(searchRightToDown(y, x, no) == no) {
				print(y, x, no);
				
			}
		}
		// 오른쪽 위 
		if(x+4 <20 && y-4 >0) {
			if(searchRightToTop(y,x,no) == no) {
				print(y, x, no);
			}
		}
	}
	private static int searchRightToTop(int y, int x, int no) {
		int tempY = y;
		int tempX = x;
		if(x-1 > 0 && y+1 < 20) {
			if(arr[y+1][x-1] == no) {
				return -1;
			}
		}
		for(int i = 0; i < 5; i++) {
			if(arr[tempY--][tempX++] != no) {
				return -1;
			}
		}
		if(x+5 <20 && y-5 >0) {
			if(arr[y-5][x+5] == no) {
				return -1;
			}
		}
		return no;
	}
	private static int searchRightToDown(int y, int x, int no) {
		int tempY = y;
		int tempX = x;
		if(x -1 > 0 && y -1 >0) {
			if(arr[y-1][x-1] == no) {
				return -1;
			}
		}
		for(int i = 0; i < 4; i ++) {
			tempY +=1;
			tempX +=1;
			if(arr[tempY][tempX] != no) {
				return -1;
			}
		}
		if(x+5 < 20 && y+5 < 20) {
			if(arr[y+5][x+5] == no) {
				return -1;
			}
		}
		return no;
	}
	private static int searchDown(int y, int x, int no) {
		int tempY = y;
		if(y-1 > 0) {
			if(arr[y-1][x] == no) {
				return -1;
			}
		}
		for(int i = 0; i< 4; i++) {
			tempY +=1;
			if(arr[tempY][x] != no) {
				return -1;
			}
		}
		if(y+5 < 20) {
			if(arr[y+5][x] == no) {
				return -1;
			}
		}
		return no;
	}
	private static int searchRight(int y, int x, int no) {
		int tempX = x;
		if(x-1 > 0) {
			if(arr[y][x-1] == no) {
				return -1;
			}
		}
		for(int i = 0; i < 4; i++) {
			tempX +=1;
			if(arr[y][tempX] != no) {
				return -1;
			}
		}
		if(x+5 < 20) {
			if(arr[y][x+5] == no) {
				return -1;
			}
		}
		return no;
	}
	private static void print(int y, int x, int no) {
		System.out.println(no);
		System.out.println(y + " " + x);
		System.exit(0);
	}
}
