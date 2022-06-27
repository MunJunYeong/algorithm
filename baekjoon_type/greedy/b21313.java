package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b21313 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		boolean flag =false;
		if(n%2 == 1) { //홀수 일 경우 	
			flag = true;
			n--;
		}
		StringBuilder sb = new StringBuilder();
		while(n-- > 0) {
			if(n % 2 == 1) {
				sb.append("1").append(" ");
			}else {
				sb.append("2").append(" ");
			}
		}
		if(flag) {
			sb.append("3");
		}
		System.out.println(sb);
		
		
	}


}