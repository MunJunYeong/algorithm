package chap9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B9020 {
	
	static boolean prime[] = new boolean[10001];
	
	public static void main(String[] args) throws IOException   {
		getPrimeCount();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i =0; i < num; i++) {
			int a =  Integer.parseInt(br.readLine());
			int fir = a/2;
			int sec = a/2;
			while(true) {
				if(!prime[fir] && !prime[sec]) {
					System.out.println(fir + " " + sec);
					break;
				}
				fir--;
				sec++;
					
			}
				
		}
		
	}

	private static void getPrimeCount() {
		prime[0] = prime[1] = true;
		for(int i =2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i*i; j < prime.length; j +=i) {
				prime[j] = true;
			}
		}
	}

	
	
	
}