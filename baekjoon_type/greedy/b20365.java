package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b20365 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		int blue = 0;
		int red = 0;
		
		StringTokenizer blueSt = new StringTokenizer(s, "R");
		StringTokenizer redSt = new StringTokenizer(s, "B");
		
		while(blueSt.hasMoreTokens()) {
			blueSt.nextToken();
			blue ++;
		}
		while(redSt.hasMoreTokens()) {
			redSt.nextToken();
			red ++;
		}
		
		if(blue >= red) {
			System.out.println(red+1);
		}else {
			System.out.println(blue+1);
			
		}
		
	}
	
}

	
	

