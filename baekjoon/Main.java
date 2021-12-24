import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException    {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		String [] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = br.readLine();
			StringTokenizer st = new StringTokenizer(arr[i]);
			int height = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int checkW = N/height+1;
			int checkH = N % height;
			
			if(N%height == 0) {
				System.out.println((height*100)+(N/height));
			}else {
				System.out.println((N*height)*100 + (N/height+1));
			}
			
			
			
			
		}
		
	}
}