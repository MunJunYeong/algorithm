package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class s20436 {
	
	static int n;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		char leftStart = st.nextToken().charAt(0);
		char rightStart = st.nextToken().charAt(0);
		
		char [][] left = new char[3][5];
		left[0][0] = 'q'; left[0][1] = 'w'; left[0][2] = 'e'; left[0][3] = 'r'; left[0][4] = 't';
		left[1][0] = 'a'; left[1][1] = 's'; left[1][2] = 'd'; left[1][3] = 'f'; left[1][4] = 'g';
		left[2][0] = 'z'; left[2][1] = 'x'; left[2][2] = 'c'; left[2][3] = 'v'; left[2][4] = 'A';
		char [][] right = new char[3][6];
		right[0][0] = 'X'; right[0][1] = 'y'; right[0][2] = 'u'; right[0][3] = 'i'; right[0][4] = 'o'; right[0][5] = 'p';
		right[1][0] = 'X'; right[1][1] = 'h'; right[1][2] = 'j'; right[1][3] = 'k'; right[1][4] = 'l'; right[1][5] = 'X';
		right[2][0] = 'b'; right[2][1] = 'n'; right[2][2] = 'm'; right[2][3] = 'A'; right[2][4] = 'A'; right[2][5] = 'A';
		
		
		int lx = 0; int ly = 0;
		int rx = 0; int ry = 0;
		
		for(int i =  0; i < 3; i++) {
			for(int j = 0; j <5; j++) {
				if(leftStart == left[i][j]) {
					ly = i; lx = j;
				}
			}
		}
		for(int i =  0; i < 3; i++) {
			for(int j = 0; j <6; j++) {
				if(rightStart == right[i][j]) {
					ry = i; rx = j;
				}
			}
		}
		
		
		String s1 = br.readLine();
		int cnt = 0;
		for(int a = 0; a < s1.length(); a ++) {
			char c = s1.charAt(a);
			//자음 left
			if(c =='q' || c =='w' || c =='e' || c =='r' || c =='t' || 
					c =='a' || c =='s' || c =='d' || c =='f' || c =='g' || 
					c =='z' || c =='x' || c =='c' || c =='v') {
				
				int nextX = 0;
				int nextY = 0;
				for(int i =  0; i < 3; i++) {
					for(int j = 0; j <5; j++) {
						if(c == left[i][j]) {
							nextY = i; nextX = j;
						}
					}
				}
				cnt += (Math.abs(lx - nextX) + Math.abs(ly- nextY));
				lx = nextX;
				ly = nextY;
			}else {
				int nextX = 0;
				int nextY = 0;
				for(int i =  0; i < 3; i++) {
					for(int j = 0; j <6; j++) {
						if(c == right[i][j]) {
							nextY = i; nextX = j;
						}
					}
				}
				cnt += (Math.abs(rx - nextX) + Math.abs(ry- nextY));
				rx = nextX;
				ry = nextY;
			}
			cnt +=1;
			
		}
		System.out.println(cnt);
	}
}

	
	

