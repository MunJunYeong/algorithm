package greedy_one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a9 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//300 60 10
		int time = Integer.parseInt(br.readLine());
		int a = 0, b = 0, c = 0;
		int check = time%10;
		while(time != 0) {
			if( check != 0) {
				System.out.println(-1);
				System.exit(0);
			}
			if(time >= 300) {
				time -= 300;
				a++;
			}else if(time >= 60) {
				time -= 60;
				b++;
			}else if(time >= 10) {
				time -= 10;
				c++;
			}
		}
		System.out.println(a + " " + b + " " + c);
	}
}
