
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); // test case number
		
		for(int i = 0; i < t; i ++) {
			int n = Integer.parseInt(br.readLine());
			int [][] score = new int[n][2];
			for(int j = 0 ; j < n; j ++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				score[j][0] = Integer.parseInt(st.nextToken());
				score[j][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(score, (o1, o2)->{
				if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			});
			int count = 0 ;
			for(int j= n-1; j >=0; j--) {
				
			}
			
			
			
		}
		
	}
}
