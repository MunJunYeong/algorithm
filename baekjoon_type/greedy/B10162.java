package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10162 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int a = 300;
		int b= 60;
		int c = 10;
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int time = Integer.parseInt(br.readLine());
		br.close();
		
		int cntA= 0;
		int cntB= 0;
		int cntC= 0;
		
		while(true) {
			if(time <0 || time%10 != 0) {
				cntA= -1; break;
			}else if(time == 0){
				break;
			}
			if(a <= time) {
				cntA ++;
				time = time-a;
			}else if( b <= time) {
				cntB ++;
				time = time-b;
			}else if( c <= time) {
				cntC++;
				time = time-c;
			}
		}
		if(cntA == -1) {
			System.out.println(-1);
		}else {
			System.out.println(cntA + " " + cntB + " " + cntC);
		}
		
		
		
	}
}
