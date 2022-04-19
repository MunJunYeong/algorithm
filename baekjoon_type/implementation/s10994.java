package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class s10994 {
	
	static int n;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int num = 1;
		
		if(n == 1) {
			System.out.println("*");
			System.exit(0);
		}else {
			for(int i = 2; i <=n; i++) {
				num += 4;
			}
		}
		String arr[][] = new String[num][num];
		
		for(int i = 0 ; i < num; i++) {
			for(int j = 0 ; j < num; j++) {
				arr[i][j] = " ";
			}
		}
		
		int time = 0;
		int limit  = num;
		int x = 0;
		int y = 0;
		for(int a = 0; a < num; a++) {
			//짝수일 경우에는 전부 색칠
			if(a % 2 == 0) {
				//오른쪽 -> 아래 -> 왼쪽 -> 위
				y = time;
				for(int i = time; i < limit; i++) {
					arr[y][i] = "*";
				}
				
				x = limit-1;
				for(int i = time; i < limit; i++) {
					arr[i][x] = "*";
				}
				
				y = limit-1;
				for(int i = limit-1; i >=time; i--) {
					arr[y][i] = "*";
				}
				
				x = time;
				for(int i = limit-1; i >=time; i--) {
					arr[i][x] = "*";
				}
			}
			limit--;
			time ++;
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0 ; j < num; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}







}

	
	


