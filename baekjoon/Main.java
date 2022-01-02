import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i =0; i<num; i++) {
			int n = i;
			int sum =0;
			
			while(n != 0) {
				sum += n%10;
				n = n/10;
			}
			if(sum + i == num) {
				result = i;
				break;
			}
			
		}
		System.out.println(result);

	}

	
}

