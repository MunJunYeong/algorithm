package dp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a1 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		//3kg , 5kg
		int mok = n/5;
		int nmg = n % 5;
		
		if(nmg == 1 || nmg ==3) {
			mok +=1;
		}else if(nmg ==2 || nmg ==4) {
			mok +=2;
		}
		
		if(n == 1 || n ==2 || n==4 || n ==7) {
			System.out.println(-1);
		}else {
			System.out.println(mok);
		}
		
		
	}
}

	
	

