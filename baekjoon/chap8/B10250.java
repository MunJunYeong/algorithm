package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250 {
	public static void main(String[] args) throws IOException    {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		String [] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = br.readLine();
			StringTokenizer st = new StringTokenizer(arr[i]);
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken()); //사용 X
			int N = Integer.parseInt(st.nextToken());
			
			int rH = 0 ; //호수
			int rW = 0; //층수
			
			if(N%h == 0) {
				rH = N/h;
				rW = h * 100;
			}else {
				rH = N/h +1;
				rW = N%h * 100;
			}
			System.out.println(rH + rW);
			
		}
		br.close();
		
	}
}